/*
package com.kafka.consumer.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;


public class CustomerDeserializer implements Deserializer {
    @Override public void close() {
    }
    @Override
    public Customer deserialize(String arg0, byte[] arg1) {
        ObjectMapper mapper = new ObjectMapper();
        Customer user = null;
        try {
            user = mapper.readValue(arg1, Customer.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
*/
