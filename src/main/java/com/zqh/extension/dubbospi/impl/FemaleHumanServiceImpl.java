package com.zqh.extension.dubbospi.impl;

import com.zqh.extension.dubbospi.HumanService;

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
