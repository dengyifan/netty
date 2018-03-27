package com.yifan.demo.netty.seri;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @version V1.0
 * @Title: TestUserInfo
 * @Package: com.yifan.demo.netty.seri
 * @Description:
 * @author: dengyin
 * @date: 18-3-27
 */
public class TestUserInfo {
    public static void main(String[] args) throws IOException {
        UserInfo info = new UserInfo();
        info.buildUserId(100).buildUserName("Welcome to Netty");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(bos);
        os.writeObject(info);
        os.flush();
        os.close();
        byte[] b = bos.toByteArray();
        System.out.println("The jdk serializable legnth is : " + b.length);
        bos.close();
        System.out.println("---------------------------");
        System.out.println("The byte array serializable legnth is :" + info.codeC().length);
    }
}
