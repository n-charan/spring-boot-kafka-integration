package com.learning.kafka.service;

import com.learning.kafka.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "java-learning-json", groupId = "myGroup")
    public void consume(User user) {
        LOG.info("Message received -> {}", user.toString());
    }
}
