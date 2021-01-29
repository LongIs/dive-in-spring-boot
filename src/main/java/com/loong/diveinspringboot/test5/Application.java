package com.loong.diveinspringboot.test5;

public class Application {

    private static final ConfigSource configSource = new ConfigSource();

    private static final RedisConfig redisConfig = new RedisConfig(configSource);
    private static final MysqlConfig mysqlConfig = new MysqlConfig(configSource);
    private static final KafkaConfig kafkaConfig = new KafkaConfig(configSource);

    public static void main(String[] args) {
        ScheduledUpdater scheduledUpdater1 = new ScheduledUpdater(redisConfig, 300, 300);
        scheduledUpdater1.run();

        ScheduledUpdater scheduledUpdater2 = new ScheduledUpdater(kafkaConfig, 300, 300);
        scheduledUpdater2.run();


        SimpleHttpServer simpleHttpServer = new SimpleHttpServer("127.0.0.1", 80);
        simpleHttpServer.addViewer("/config",redisConfig);
        simpleHttpServer.addViewer("/config", mysqlConfig);
        simpleHttpServer.run();
    }

}
