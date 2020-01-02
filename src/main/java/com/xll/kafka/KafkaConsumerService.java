package com.xll.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class KafkaConsumerService {
    public static void startConsumer() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "106.13.231.38:9092");
        props.put("group.id", "aa");
        props.put("enable.auto.commit", "false");
        props.put("auto.commit.interval.ms", "1000");
        props.put("auto.offset.reset", "earliest");
        props.put("session.timeout.ms", "30000");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);

        //  两分钟
        long end = new Date().getTime() + 120000;

        consumer.subscribe(Arrays.asList("test2"));

        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord record : records) {
                String key = (String) record.key();
                String value = (String) record.value();
                long offset = record.offset();
                System.out.println("/////////////////////////key : " + key + ", value : " + value + ", offset : " + offset);
            }
            if (new Date().getTime() > end) {
                System.out.println("消费结束!!");
                return;
            }
        }
    }
}
