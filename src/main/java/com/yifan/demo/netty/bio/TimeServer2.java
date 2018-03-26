package com.yifan.demo.netty.bio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version V1.0
 * @Title: TimeServer2
 * @Package: com.yifan.demo.netty.bio
 * @Description: 伪异步 通过 线程池来实现
 * @author: dengyin
 * @date: 18-3-26
 */
public class TimeServer2 {

    public static void main(String[] args) {
        int port = 8080;
        if (args != null && args.length > 0) {
           try {
               port = Integer.valueOf(args[0]);
           } catch (NumberFormatException e) {
               e.printStackTrace();
           }
        }
        ServerSocket server = null;
        try {
           server = new ServerSocket(port);
           System.out.println("The time server is start in port : " + port);
           Socket socket = null;

           //创建 I/O 线程池
            TimeServerHandlerExecutePool singleExecutor = new TimeServerHandlerExecutePool(50, 10000);
            while (true) {
                socket = server.accept();
                singleExecutor.execute(new TimeServerHandler(socket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != server) {
                System.out.println("The time server close");
                try {
                    server.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                server = null;
            }

        }
    }
}
