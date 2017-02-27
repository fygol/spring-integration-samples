package io.samples.spring.integration.channels;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.MessageChannel;

@Configuration
public class Config {
    @Bean
    public MessageChannel queueChannel() {
        QueueChannel queueChannel = new QueueChannel();

        return queueChannel;
    }
}
