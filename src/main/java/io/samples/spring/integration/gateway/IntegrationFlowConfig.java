package io.samples.spring.integration.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.messaging.MessageChannel;

import java.util.concurrent.TimeUnit;

@Configuration
public class IntegrationFlowConfig {
    @Bean
    public MessageChannel inputChannel() {
        return new DirectChannel();
    }

    @Bean
    public MessageChannel outputChannel() {
        return new DirectChannel();
    }

    @Bean
    public IntegrationFlow flow() {
        return IntegrationFlows.from(inputChannel())
                .handle((payload, headers) -> {
                    System.out.println("payload: " + payload);
                    String tName = Thread.currentThread().getName();
                    System.out.println("Handler's thread: " + tName);

                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    return payload;
                })
                .channel(outputChannel())
                .get();
    }
}
