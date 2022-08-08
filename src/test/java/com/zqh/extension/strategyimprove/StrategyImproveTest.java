package com.zqh.extension.strategyimprove;

import com.zqh.extension.strategyimprove.application.human.HumanService;
import com.zqh.extension.strategyimprove.application.messageserver.IMessageServer;
import com.zqh.extension.strategyimprove.sdk.ExtensionRouterFactory;
import org.junit.Test;

/**
 * @author fangchen
 * @date 2022-08-08 15:59
 */
public class StrategyImproveTest {

    @Test
    public void testStrategyImprove() {
        // 使用 qq 服务器进行发送
        IMessageServer qqMessageServer = ExtensionRouterFactory.getPlugin(IMessageServer.class, "QQ");
        qqMessageServer.sendMessage("hello world");

        // 男人说话
        HumanService maleHumanService = ExtensionRouterFactory.getPlugin(HumanService.class, "maleHuman");
        maleHumanService.say();
    }
}
