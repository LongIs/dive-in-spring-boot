package com.loong.diveinspringboot.test9.factory;

public class RuleConfigSourceNew {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);

        if (parserFactory == null) {
            throw new RuntimeException("Rule config file format is not supported: " + ruleConfigFilePath);
        }

        IRuleConfigParser parser = parserFactory.createParser();

        String configText = "";
        // 从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }


    private String getFileExtension(String filePath) {
        return "json";
    }


}
