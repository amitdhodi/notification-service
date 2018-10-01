package com.tesco.notification.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @Autowired
    private SimpMessagingTemplate template;

    @StreamListener(target = "inbound")
    public void processMessage(Message pushMessage){
        this.template.convertAndSend("/topic/pushNotification", pushMessage);
    }
}
