package com.zqh.extension.strategy;

/**
 * 消息服务
 * @author fangchen
 * @date 2022-08-08 10:28
 */
public interface IMessageServer {


    /**
     * 服务器类型
     * @return 服务器类型
     */
    String type();

    /**
     * 发送消息
     * @param message 消息
     */
    void sendMessage(String message);
}
