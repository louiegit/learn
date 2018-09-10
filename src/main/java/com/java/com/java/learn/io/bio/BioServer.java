package com.java.com.java.learn.io.bio;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-08-21 上午11:04
 */
public class BioServer {

    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket(8080);
            while(true){
                Socket client = socket.accept();
                Thread thread = new Thread(() -> {
                    OutputStream out;
                    try {
                        out = client.getOutputStream();
                        out.write("hi".getBytes(Charset.defaultCharset()));
                        out.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        try {
                            client.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
