package io.samples.spring.integration.gateway;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(
        defaultRequestChannel = "inputChannel",
        defaultReplyChannel = "outputChannel"
//        , defaultReplyTimeout = "1000"
)
public interface GatewayService {
    String process(String input);
}
