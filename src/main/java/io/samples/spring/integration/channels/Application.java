package io.samples.spring.integration.channels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.support.MessageBuilder;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);


        MessageHandler messageHandler1 = ctx.getBean(MessageHandler.class);
        messageHandler1.setName("h1");

        MessageHandler messageHandler2 = ctx.getBean(MessageHandler.class);
        messageHandler2.setName("h2");

        QueueChannel queueChannel = ctx.getBean("queueChannel", QueueChannel.class);


        queueChannel.send(MessageBuilder.withPayload("message-1").build());
        queueChannel.send(MessageBuilder.withPayload("message-2").build());
        queueChannel.send(MessageBuilder.withPayload("message-3").build());

    }

}
