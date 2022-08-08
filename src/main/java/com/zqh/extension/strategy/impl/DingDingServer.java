package com.zqh.extension.strategy.impl;

import com.zqh.extension.strategy.AbstractMessageServer;

/**
 * @author fangchen
 * @date 2022-08-08 10:31
 */
public class DingDingServer extends AbstractMessageServer {

    @Override
    public String type() {
        return "DingDing";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this id DingDing's message! " + message);
    }
}
