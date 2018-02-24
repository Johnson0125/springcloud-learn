package com.sen.kafka.code;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Sink {

    //接收队列1
    String INPUT = "testa";

    @Input(Sink.INPUT)
    SubscribableChannel input();
}
