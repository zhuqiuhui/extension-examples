package com.zqh.extension.strategyimprove.application.human.impl;

import com.zqh.extension.strategyimprove.application.human.HumanService;

/**
 * @author fangchen
 * @date 2022-08-08 12:11
 */
public class FemaleHumanServiceImpl implements HumanService {

    @Override
    public void say() {
        System.out.println("this is female human say!");
    }
}
