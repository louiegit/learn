package com.java.com.java.learn.io.netty.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.sctp.nio.NioSctpServerChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.timeout.IdleStateHandler;

import java.net.InetSocketAddress;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-08-20 下午7:51
 */
public class EchoServer {


    public static void main(String[] args) {


        NioEventLoopGroup acceptorGroup = new NioEventLoopGroup(1);
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap bootstrap = new ServerBootstrap();
            bootstrap
                    //acceptorGroup用于接受client的请求，workerGroup处理自身的task
                    .group(acceptorGroup, workerGroup)
                    //设置将要被实例化的 ServerChannel 类
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        //ChannelInitializer 。当一个新的连接被接受，一个新的子 Channel 将被创建，
                        //ChannelInitializer 会添加我们EchoServerHandler 的实例到 Channel 的 ChannelPipeline。
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ChannelPipeline pipeline = ch.pipeline();
                            pipeline.addLast(new ProtobufVarint32FrameDecoder());
                            pipeline.addLast(new IdleStateHandler(6, 0, 0));
                            pipeline.addLast(new EchoServerHandler());
                        }
                    });
            //阻塞线程，绑定端口20000
            Channel ch = bootstrap.bind(20000).sync().channel();
            System.out.println("Server has started...");
            //关闭 channel 和块，直到它被关闭
            ch.closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            acceptorGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

}
