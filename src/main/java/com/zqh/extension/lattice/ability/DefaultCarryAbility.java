package com.zqh.extension.lattice.ability;

import com.zqh.extension.lattice.extension.ICarryBusinessExt;

/**
 * @author fangchen
 * @date 2022-08-08 17:08
 */
//@Ability
public class DefaultCarryAbility implements ICarryAbility {

    @Override
    public void carry() {
        // Step 1：找到货物
        //......


        // Step 2：搬运货物（可根据不同业务场景bizCode获取不的扩展点）
//        ICarryBusinessExt iCarryBusinessExt = getICarryBusinessExt(bizCode);
//        iCarryBusinessExt.carry();

        // Step 3：放置货物
        //......

    }
}
