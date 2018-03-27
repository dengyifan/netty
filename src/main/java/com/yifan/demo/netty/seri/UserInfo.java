package com.yifan.demo.netty.seri;

import java.io.Serializable;
import java.nio.ByteBuffer;

/**
 * @version V1.0
 * @Title: UserInfo
 * @Package: com.yifan.demo.netty.seri
 * @Description:
 * @author: dengyin
 * @date: 18-3-27
 */
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 3566424122178231618L;

    private String userName;

    private int userId;

    public UserInfo buildUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserInfo buildUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public byte[] codeC() {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        byte[] value = this.userName.getBytes();
        buffer.putInt(value.length);
        buffer.put(value);
        buffer.putInt(this.userId);
        buffer.flip();
        value = null;
        byte[] result = new byte[buffer.remaining()];
        buffer.get(result);
        return result;
    }
}
