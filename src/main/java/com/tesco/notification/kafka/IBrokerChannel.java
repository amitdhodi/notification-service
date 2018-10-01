package com.tesco.notification.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface IBrokerChannel {

    @Input("inbound")
    SubscribableChannel inbound();
}
