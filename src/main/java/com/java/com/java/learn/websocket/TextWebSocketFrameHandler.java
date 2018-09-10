package com.java.com.java.learn.websocket;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;

/**
 * Created with IntelliJ IDEA.
 * Description: 扩展SimpleChannelInboundHandler用于处理TextWebSocketFrame
 * User: tianxiang.luo
 * Date: 2018-09-08 下午2:23
 */
public class TextWebSocketFrameHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    private ChannelGroup channelGroup;

    public TextWebSocketFrameHandler(ChannelGroup channelGroup){
        this.channelGroup = channelGroup;
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt){
        //2.覆写userEventTriggered() 方法来处理自定义事件
        if (evt == WebSocketServerProtocolHandler.ServerHandshakeStateEvent.HANDSHAKE_COMPLETE){
            //3.如果接手的事件表明握手成功，就从ChannelPipeline中删除HttpRequestHandler，因为接下来不会接受HTTP消息了
            ctx.pipeline().remove(HttpRequestHandler.class);
            //4.写一条消息给所有的已连接的WebSocket客户端，通知他们新建立一个新的Channel连接
            channelGroup.writeAndFlush(new TextWebSocketFrame("Client" + ctx.channel()) + " joined");
            //5.添加新连接的WebSocket Channel到ChannelGroup中，这样它就收到所有的信息
            channelGroup.add(ctx.channel());
        }else{

        }
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, TextWebSocketFrame textWebSocketFrame) throws Exception {
        //6.保留收到的消息，并通过writeAndFlush()传递给所有连接的客户端
        channelGroup.writeAndFlush(textWebSocketFrame.retain());
    }

}
