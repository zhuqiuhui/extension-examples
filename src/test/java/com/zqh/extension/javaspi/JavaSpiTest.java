package com.zqh.extension.javaspi;

import org.junit.Test;

/**
 * @author fangchen
 * @date 2022-08-08 10:38
 */
public class JavaSpiTest {

    @Test
    public void testJavaSpi() {
        // init message server factory
        MessageServerFactory messageServerFactory = new MessageServerFactory();

        // client invoke
        IMessageServer emailMessageServer = messageServerFactory.getByType("email");
        emailMessageServer.sendMessage("I am hungry");
    }
}
