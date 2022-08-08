package com.zqh.extension.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fangchen
 * @date 2022-08-08 14:39
 */
public class MessageServerFactory {

    private final Map<String, IMessageServer> messageServerMap = new HashMap<>();

    private final IMessageServer[] iMessageServers;

    public MessageServerFactory(IMessageServer[] iMessageServers) {
        this.iMessageServers  = iMessageServers;
        // init map
        for(IMessageServer iMessageServer : iMessageServers) {
            messageServerMap.put(iMessageServer.type(), iMessageServer);
        }
    }

    public IMessageServer getByType(String type) {
        return messageServerMap.get(type);
    }
}
