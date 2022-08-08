package com.zqh.extension.strategy.impl;

import com.zqh.extension.strategy.AbstractMessageServer;

/**
 * @author fangchen
 * @date 2022-08-08 10:31
 */
public class QQServer extends AbstractMessageServer {

    @Override
    public String type() {
        return "QQ";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this is QQ's message! " + message);
    }
}
