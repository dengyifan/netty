package com.yifan.demo.netty.nio;

/**
 * @version V1.0
 * @Title: TimeClient
 * @Package: com.yifan.demo.netty.nio
 * @Description:
 * @author: dengyin
 * @date: 18-3-26
 */
public class TimeClient {
    public static void main(String[] args) {
        int port = 8080;
        if (null != args && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        new Thread(new TimeClientHandle("127.0.0.1", port)).start();
    }
}
