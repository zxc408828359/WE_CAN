package com.cxw.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        Socket s;
        try {
            // 客户机连接服务端的IP地址和端口号
            s = new Socket("127.0.0.1", 8888);
            System.out.println("连接到服务器.....");
            // 获得输入流（字节流），再把字节输入流放到缓冲输入流中
            InputStream in = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String msg = "";
            msg = br.readLine();
            System.out.println(msg);
            //关闭掉流
            br.close();
            in.close();
            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

