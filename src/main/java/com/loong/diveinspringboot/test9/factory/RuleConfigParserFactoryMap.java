package com.loong.diveinspringboot.test9.factory;


import java.util.HashMap;
import java.util.Map;

// 因为工厂类只包含方法，不包含成员变量，完全可以复用，
// 不需要每次都创建新的工厂类对象，所以，简单工厂模式的第二种实现思路更加合适。
public class RuleConfigParserFactoryMap {

    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        cachedFactories.put("json", /*new JsonRuleConfigParserFactory()*/null);
        cachedFactories.put("xml", /*new JsonRuleConfigParserFactory()*/null);
        cachedFactories.put("yaml", /*new JsonRuleConfigParserFactory()*/null);
        cachedFactories.put("properties", /*new JsonRuleConfigParserFactory()*/null);
    }


    public static IRuleConfigParserFactory getParserFactory(String type) {

        if (type == null || type.isEmpty()) {
            return null;
        }

        IRuleConfigParserFactory parserFactory = cachedFactories.get(type.toLowerCase());
        return parserFactory;
    }
}
