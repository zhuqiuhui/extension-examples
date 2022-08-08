package com.zqh.extension.strategyimprove.application.messageserver.impl;

import com.zqh.extension.strategyimprove.application.messageserver.IMessageServer;

/**
 * 邮件发送消息
 * @author fangchen
 * @date 2022-08-08 10:30
 */
public class EmailServer implements IMessageServer {

    @Override
    public String type() {
        return "email";
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("this is email's message! " + message);
    }
}
