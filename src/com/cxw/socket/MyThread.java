package com.cxw.socket;

public class MyThread implements Runnable {
    @Override
    public void run() {
        SocketServer2 socketServer = new SocketServer2();
        socketServer.starup();
    }
}
