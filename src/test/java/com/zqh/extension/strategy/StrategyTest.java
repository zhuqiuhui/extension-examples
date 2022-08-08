package com.zqh.extension.strategy;

import com.zqh.extension.strategy.impl.DingDingServer;
import com.zqh.extension.strategy.impl.EmailServer;
import com.zqh.extension.strategy.impl.QQServer;
import org.junit.Test;

/**
 * @author fangchen
 * @date 2022-08-08 15:08
 */
public class StrategyTest {

    @Test
    public void testStrategy() {
        /**
         * 初始化 MessageServerFactory，在Spring 容器中可使用构造器注入方式进行服务类进行自动注入
         */
        IMessageServer[] iMessageServers = new IMessageServer[]{
                new DingDingServer(),
                new EmailServer(),
                new QQServer()
        };
        MessageServerFactory messageServerFactory = new MessageServerFactory(iMessageServers);

        // 调用
        IMessageServer emailMessageServer = messageServerFactory.getByType("email");
        emailMessageServer.sendMessage("hello world");
    }
}
