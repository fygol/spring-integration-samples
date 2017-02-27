package io.samples.spring.integration.serviceactivator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class UserService {
    @ServiceActivator(inputChannel = "inputChannel", outputChannel = "outputChannel")
    public User create(User user, @Headers Map<String, Object> headers) {
        log.debug("Create user {}", user);
        log.debug("headers: {}", headers);

        return user;
    }
}
