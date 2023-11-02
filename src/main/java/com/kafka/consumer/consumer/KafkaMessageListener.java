package com.kafka.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaMessageListener {
    @KafkaListener(topics = "3rd-topic", groupId = "3rd-topic-group-1")
    public void consume(String message) {
        log.info("Consume the message =>> [{}]", message);
    }
}
