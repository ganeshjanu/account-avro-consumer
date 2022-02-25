package com.friends.accountserviceconsumer;

import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class AccountServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceConsumerApplication.class, args);
    }

}
