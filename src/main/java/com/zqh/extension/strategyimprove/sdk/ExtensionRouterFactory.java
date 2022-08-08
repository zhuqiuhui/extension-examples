package com.zqh.extension.strategyimprove.sdk;

/**
 * @author fangchen
 * @date 2022-08-08 15:45
 */
public class ExtensionRouterFactory {

    public static <T extends IExtension> T getPlugin(Class<T> clazz, String name) {
        return ExtensionPluginBoot.getInstance().getNameExtension(clazz, name);
    }
}
