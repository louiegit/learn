package com.java.com.java.learn.io.netty.client;

import com.google.common.base.Charsets;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 标记这个类的实例可以在 channel 里共享
 * SimpleChannelInboundHandler
 */
@ChannelHandler.Sharable
public class EchoClientHandler extends SimpleChannelInboundHandler<ByteBuf>{

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext,
                                ByteBuf byteBuf) throws Exception {
        System.out.println("Client received:" + byteBuf.toString());
    }

    //每当接受数据都会调用这个方法，服务器接受的消息会被分块接受，不是一次接受所有字节，而是调用多次，能保证字节是顺序传输
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(Unpooled.copiedBuffer("Netty rocks", Charsets.UTF_8));
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }
}
