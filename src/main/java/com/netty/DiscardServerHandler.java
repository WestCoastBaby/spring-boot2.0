package com.netty;

import io.netty.buffer.ChannelBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Handles a server-side channel. -2000 +4000
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter { // (1)


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
        // Close the connection when an exception is raised.
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void inboundBufferUpdated(ChannelHandlerContext channelHandlerContext) throws Exception {

    }

    @Override
    public ChannelBuf newInboundBuffer(ChannelHandlerContext channelHandlerContext) throws Exception {
        channelHandlerContext.channel();
        return null;
    }

    @Override
    public void freeInboundBuffer(ChannelHandlerContext channelHandlerContext, ChannelBuf channelBuf) throws Exception {

    }
}