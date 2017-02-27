package io.samples.spring.integration.serviceactivator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        MessageChannel inputChannel = ctx.getBean("inputChannel", MessageChannel.class);

        inputChannel.send(MessageBuilder.withPayload(new User(1L, "John"))
                .setHeader("header-1", "value-1")
                .build());
    }

}
