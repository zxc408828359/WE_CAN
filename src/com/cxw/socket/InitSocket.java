package com.cxw.socket;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitSocket implements ServletContextListener {

    private Thread thread;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        String str = null;
        if (str == null && thread == null) {
            MyThread myThread = new MyThread();
            this.thread = new Thread(myThread);
            thread.start(); // servlet 上下文初始化时启动 socket
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        if (thread != null && thread.isInterrupted()) {
            thread.interrupt();
        }
    }
}
