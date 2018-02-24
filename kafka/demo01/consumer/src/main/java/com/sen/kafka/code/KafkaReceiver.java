package com.sen.kafka.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(value = {Sink.class})
public class KafkaReceiver {

    private final Logger logger = LoggerFactory.getLogger(KafkaReceiver.class);

    @StreamListener(Sink.INPUT)
    public void receive(String vote) {
        logger.info("receive message : " + vote);
    }
}
