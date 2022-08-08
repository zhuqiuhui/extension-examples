package com.zqh.extension.javaspi.impl;

import com.zqh.extension.javaspi.IMessageServer;

/**
 * @author fangchen
 * @date 2022-08-08 10:31
 */
public class QQServer implements IMessageServer {

    @Override
    public String type() {
        return "QQ";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this is QQ's message! " + message);
    }
}
