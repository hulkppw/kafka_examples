package com.tuwaner.examples.producer;

import com.tueaner.examples.consumer.Consumer;
import com.tuwaner.examples.KafkaProperties;

/**
 * Created by wanglingyun on 2017/4/21.
 */
public class KafkaConsumerProducerDemo {
    public static void main(String[] args) {
        boolean isAsync = args.length == 0 || !args[0].trim().equalsIgnoreCase("sync");
        Producer producerThread = new Producer(KafkaProperties.TOPIC, isAsync);
        producerThread.start();

        Consumer consumerThread = new Consumer(KafkaProperties.TOPIC);
        consumerThread.start();
    }
}
