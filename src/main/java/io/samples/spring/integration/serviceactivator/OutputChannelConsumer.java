package io.samples.spring.integration.serviceactivator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OutputChannelConsumer {
    @ServiceActivator(inputChannel = "outputChannel")
    public void handle(Message<User> message) {
        log.debug("Consume message {}", message);
    }
}
