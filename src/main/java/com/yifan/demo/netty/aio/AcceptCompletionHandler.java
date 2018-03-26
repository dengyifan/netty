package com.yifan.demo.netty.aio;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * @version V1.0
 * @Title: AcceptCompletionHandler
 * @Package: com.yifan.demo.netty.aio
 * @Description:
 * @author: dengyin
 * @date: 18-3-26
 */
public class AcceptCompletionHandler implements CompletionHandler<AsynchronousSocketChannel, AsyncTimeServerHandler> {

    /**
     * Invoked when an operation has completed.
     *
     * @param result     The result of the I/O operation.
     * @param attachment
     */
    @Override
    public void completed(AsynchronousSocketChannel result, AsyncTimeServerHandler attachment) {
        attachment.asynchronousServerSocketChannel.accept(attachment, this);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        result.read(buffer, buffer, new ReadCompletionHandler(result));
    }

    /**
     * Invoked when an operation fails.
     *
     * @param exc        The exception to indicate why the I/O operation failed
     * @param attachment
     */
    @Override
    public void failed(Throwable exc, AsyncTimeServerHandler attachment) {
        exc.printStackTrace();
        attachment.latch.countDown();
    }
}
