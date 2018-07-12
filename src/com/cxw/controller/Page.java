package com.cxw.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    @Autowired
    CommService commService;
/*    @Resource(name = "jmsTemplate")
    private JmsTemplate jmsTemplate;*/

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
/*
    @RequestMapping("/send1")
    public String send1() {
        sendMessage(new ActiveMQQueue("cxw"),"hello1");
        return "";
    }
    @RequestMapping("/send2")
    public String send2() {
        sendMessage("hello2");
        return "";
    }



    public void sendMessage(Destination destination, final String msg){
        System.out.println(Thread.currentThread().getName()+" 向队列"+destination.toString()+"发送消息---------------------->"+msg);
        jmsTemplate.send(destination, new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }
    public void sendMessage(final String msg){
        String destination = jmsTemplate.getDefaultDestinationName();
        System.out.println(Thread.currentThread().getName()+" 向队列"+destination+"发送消息---------------------->"+msg);
        jmsTemplate.send(new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }
*/

}
