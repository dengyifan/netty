package com.yifan.demo.handler.codec.msgpack;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import org.msgpack.MessagePack;

/**
 * @version V1.0
 * @Title: MsgPackEncoder
 * @Package: com.yifan.demo.handler.codec.msgpack
 * @Description:
 * @author: dengyin
 * @date: 18-3-27
 */
public class MsgPackEncoder extends MessageToByteEncoder<Object>{
    /**
     * Encode a message into a {@link ByteBuf}. This method will be called for each written message that can be handled
     * by this encoder.
     *
     * @param ctx the {@link ChannelHandlerContext} which this {@link MessageToByteEncoder} belongs to
     * @param msg the message to encode
     * @param out the {@link ByteBuf} into which the encoded message will be written
     * @throws Exception is thrown if an error accour
     */
    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
        MessagePack pack = new MessagePack();

        //序列化
        byte[] raw = pack.write(msg);
        out.writeBytes(raw);
    }
}
