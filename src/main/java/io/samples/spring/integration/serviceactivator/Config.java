package io.samples.spring.integration.serviceactivator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageChannel;

@Configuration
@Slf4j
public class Config {
    @Bean
    public MessageChannel inputChannel() {
        log.debug("Creating DirectChannel(\"inputChannel\")");
        return new DirectChannel();
    }

    @Bean
    public MessageChannel outputChannel() {
        log.debug("Creating DirectChannel(\"outputChannel\")");
        return new DirectChannel();
    }
}
