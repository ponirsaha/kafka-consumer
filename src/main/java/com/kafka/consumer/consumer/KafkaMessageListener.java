package com.kafka.consumer.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.consumer.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class KafkaMessageListener {
    @KafkaListener(topics = "4th-topic", groupId = "3rd-topic-group-2")
    public void consume(@Payload String message) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Customer customer = objectMapper.readValue(message, Customer.class);
        if (customer.getAge() < 18) {
            System.out.println("you are not authorized");
        }
        log.info("Consume the message =>> [{}]", customer);
    }
}
