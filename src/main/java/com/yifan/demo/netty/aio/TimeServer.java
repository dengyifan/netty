package com.yifan.demo.netty.aio;

/**
 * @version V1.0
 * @Title: TimeServer
 * @Package: com.yifan.demo.netty.aio
 * @Description:
 * @author: dengyin
 * @date: 18-3-26
 */
public class TimeServer {
    public static void main(String[] args) {
        int port = 8080;
        if (null != args && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

    }
}
