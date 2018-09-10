package com.java.com.java.learn.websocket;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-09-08 下午3:17
 */
public class ChatServerInitializer extends ChannelInitializer<SocketChannel> {

    private ChannelGroup channelGroup;

    public ChatServerInitializer(ChannelGroup channelGroup) {
        this.channelGroup = channelGroup;
    }

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        ChannelPipeline pipeline = channel.pipeline();
        //Decode bytes to HttpRequest, HttpContent, LastHttpContent.Encode HttpRequest, HttpContent, LastHttpContent to bytes.
        pipeline.addLast(new HttpServerCodec());
        //This ChannelHandler aggregates an HttpMessage and its following HttpContents into a single FullHttpRequest or FullHttpResponse
        // (depending on whether it is being used to handle requests or responses).
        // With this installed the next ChannelHandler in the pipeline will receive only full HTTP requests.
        pipeline.addLast(new HttpObjectAggregator(64*1024));
        //Write the contents of a file.
        pipeline.addLast(new ChunkedWriteHandler());
        //Handle FullHttpRequests (those not sent to "/ws" URI).
        pipeline.addLast(new HttpRequestHandler("/ws"));
        //As required by the WebSockets specification, handle the WebSocket Upgrade handshake,
        // PingWebSocketFrames,PongWebSocketFrames and CloseWebSocketFrames.
        pipeline.addLast(new WebSocketServerProtocolHandler("/ws"));
        //Handles TextWebSocketFrames and handshake completion events
        pipeline.addLast(new TextWebSocketFrameHandler(channelGroup));
    }
}
