package com.xll.kafka;

public class KafkaStart {
    public static void main(String[] args) {

        //  消费者线程
        new Thread(() -> {
            KafkaConsumerService.startConsumer();
        }).start();

        //  生产者线程
        new Thread(() -> {
            KafkaProducerService.startProducer();
        }).start();

    }
}
