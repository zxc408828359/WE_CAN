package com.cxw.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.cxw.socket.SocketServer2;
import com.cxw.socket.TextRunningThread;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cxw.pojo.TbCategory;
import com.cxw.pojo.TbItem;
import com.cxw.service.CommService;


@Controller
public class Page {
    private static final Logger logger = Logger.getLogger(Page.class);

    @Autowired
    CommService commService;

    //@Resource(name = "jmsTemplate")
    private JmsTemplate jmsTemplate;

    @RequestMapping("/{url}")
    public String page2(@PathVariable String url) {
        return url;
    }

    @RequestMapping("/index")
    public String page1(Model model) {
        List<TbItem> list = commService.getAllPro();
        List<TbCategory> catlist = commService.getCategoryList();
        model.addAttribute("list", list);
        model.addAttribute("catlist", catlist);
        return "index";
    }

    @RequestMapping("/admin/login")
    public String login(String username, String password, Model model, HttpServletRequest request) {
        if (!username.equals("admin")) {
            model.addAttribute("err", "用户名错误");
            return "login";
        }
        if (!password.equals("admin0906")) {
            model.addAttribute("err", "密码错误");
            return "login";
        }
        model.addAttribute("err", "");
        HttpSession session = request.getSession();
        session.setAttribute("User", "ok");
        return "mun";
    }


    @RequestMapping("/send1/{user}")
    public String send1(@PathVariable String user) {
        sendMessage(new ActiveMQQueue(user),"hello1");
        return "";
    }
    @RequestMapping("/send2")
    public String send2() {
        sendMessage("hello2");
        return "";
    }
    @RequestMapping("/connect2")
    public String connect2() {
        try {
            connect();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
    @RequestMapping("/starup")
    public String starup() {
        try {
            //logger.error("异常！！！！！！！！");
            SocketServer2 socketServer = new SocketServer2();
            socketServer.starup();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    @RequestMapping("/listRunningThread")
    public String ListRunningThread() {
        try {
            TextRunningThread.listAllThreads();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }













    public void connect() throws Exception{
        Socket clientSocket = new Socket("127.0.0.1", Integer.parseInt("8088"));
        InputStreamReader streamReader = new InputStreamReader(clientSocket.getInputStream());
        final BufferedReader reader = new BufferedReader(streamReader);
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
        String uuid = UUID.randomUUID().toString().replace("-", "");
        writer.println(uuid);
        writer.flush();
        System.out.println("已连接");
        // 接收服务器消息的线程
         Runnable incomingReader = new Runnable() {
            @Override
            public void run() {
                String message;
                try {
                    while ((message = reader.readLine()) != null) {
                        System.out.println(message);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };
        Thread readerThread = new Thread(incomingReader);
        readerThread.start();
    }





    public void sendMessage(Destination destination, final String msg){
        System.out.println(Thread.currentThread().getName()+" 向队列"+destination.toString()+"发送消息---------------------->\t"+msg);
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }
    public void sendMessage(final String msg){
        String destination = jmsTemplate.getDefaultDestinationName();
        System.out.println(Thread.currentThread().getName()+" 向队列"+destination+"发送消息---------------------->\t"+msg);
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }

}
