package com.java.com.java.learn.websocket;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: tianxiang.luo
 * Date: 2018-09-10 下午7:53
 */
@org.springframework.stereotype.Controller
@RequestMapping("/controller")
public class Controller {

    @RequestMapping("/index")
    public String index(){
        return "WebsocketChatClient";
    }
}
