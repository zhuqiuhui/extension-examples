package com.zqh.extension.javaspi;

import com.zqh.extension.javaspi.IMessageServer;

import java.util.Objects;
import java.util.ServiceLoader;

/**
 * @author fangchen
 * @date 2022-08-08 10:46
 */
public class MessageServerFactory {

    private ServiceLoader<IMessageServer> messageServerServiceLoader = ServiceLoader.load(IMessageServer.class);

    public IMessageServer getByType(String type) {
        for (IMessageServer messageServer : messageServerServiceLoader) {
            if(Objects.equals(messageServer.type(), type)) {
                return messageServer;
            }
        }
        return null;
    }
}
