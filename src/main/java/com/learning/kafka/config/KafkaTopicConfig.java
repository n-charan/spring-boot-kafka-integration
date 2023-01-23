package com.learning.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic learningTopic() {
        return TopicBuilder.name("java-learning").build();
    }

    @Bean
    public NewTopic learningJsonTopic() {
        return TopicBuilder.name("java-learning-json").build();
    }
}
