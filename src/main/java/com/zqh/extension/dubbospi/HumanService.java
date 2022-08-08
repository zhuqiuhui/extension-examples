package com.zqh.extension.dubbospi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author fangchen
 * @date 2022-08-08 12:08
 */
@SPI
public interface HumanService {

    void say();
}
