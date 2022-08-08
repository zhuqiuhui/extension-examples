package com.zqh.extension.strategyimprove.sdk;

import com.zqh.extension.strategyimprove.application.human.HumanService;
import com.zqh.extension.strategyimprove.application.human.impl.FemaleHumanServiceImpl;
import com.zqh.extension.strategyimprove.application.human.impl.MaleHumanServiceImpl;
import com.zqh.extension.strategyimprove.application.messageserver.IMessageServer;
import com.zqh.extension.strategyimprove.application.messageserver.impl.DingDingServer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author fangchen
 * @date 2022-08-08 15:34
 */
public class ExtensionPluginBoot {

    private static ExtensionPluginBoot instance = null;


    /**
     * class --> (name, instance)
     */
    private static Map<Class<? extends IExtension>, Map<String, IExtension>> extendPlugins = new LinkedHashMap<>();


    public static ExtensionPluginBoot getInstance() {
        if(instance == null) {
            synchronized (ExtensionPluginBoot.class) {
                if(instance == null) {
                    new ExtensionPluginBoot().init();
                }
            }
        }
        return instance;
    }

    public void init() {
        // 加载扩展点，将服务实现类 put 进 extendPlugins
        loadExtendPluginClasses();
        instance = this;
    }

    private void loadExtendPluginClasses() {
        // 这里可使用扫描注解、配置文件等方式，下面直接 new 做为示例
        /**
         * 消息服务器
         */
        Map<String, IExtension> messageServerMap = new HashMap<>();
        messageServerMap.put("DingDing", new DingDingServer());
        messageServerMap.put("email", new DingDingServer());
        messageServerMap.put("QQ", new DingDingServer());
        extendPlugins.put(IMessageServer.class, messageServerMap);
        /**
         * 人类
         */
        Map<String, IExtension> humanMap = new HashMap<>();
        humanMap.put("maleHuman", new MaleHumanServiceImpl());
        humanMap.put("femaleHuman", new FemaleHumanServiceImpl());
        extendPlugins.put(HumanService.class, humanMap);
    }


    /**
     * 根据扩展接口和名称，获取具体的实现
     * @param extensionPoint 扩展接口
     * @param name 名称
     * @param <T> 扩展类实例
     * @return
     */
    public <T extends IExtension> T getNameExtension(Class<T> extensionPoint, String name) {
        Map<String, IExtension> pluginMap = extendPlugins.get(extensionPoint);
        if(pluginMap == null) {
            return null;
        }
        return (T) pluginMap.get(name);
    }
}
