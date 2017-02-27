package io.samples.spring.integration.channels;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Scope("prototype")
public class MessageHandler {

    @Setter
    private String name;

    @ServiceActivator(inputChannel = "queueChannel")
    public void handleMessage(String payload) {
        log.debug("Handler {} handles message: {}", name, payload);
    }
}
