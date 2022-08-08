package com.zqh.extension.dubbospi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

/**
 * @author fangchen
 * @date 2022-08-08 12:14
 */
public class DubboSpiTest {

    @Test
    public void testDubboSpi() {
        HumanService maleHumanService = ExtensionLoader.getExtensionLoader(HumanService.class)
                .getExtension("maleHumanService");
        maleHumanService.say();
    }
}
