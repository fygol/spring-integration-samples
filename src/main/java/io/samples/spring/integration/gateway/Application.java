package io.samples.spring.integration.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        GatewayService gateway = ctx.getBean(GatewayService.class);
        String response = gateway.process("Test Data");

        System.out.println("response: " + response);
    }
}
