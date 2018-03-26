package com.yifan.demo.netty.nio;

/**
 * @version V1.0
 * @Title: TimeServer
 * @Package: com.yifan.demo.netty.nio
 * @Description: 基于 NIO 的异步，注意不是 NIO2
 * @author: dengyin
 * @date: 18-3-26
 */
public class TimeServer {
   public static void main(String[] args) {
      int port = 8080;
        if (args != null && args.length > 0) {
           try {
               port = Integer.valueOf(args[0]);
           } catch (NumberFormatException e) {
               e.printStackTrace();
           }
        }
        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);
        new Thread(timeServer, "NIO-MultiplexerTimeServer-001").start();
   }
}
