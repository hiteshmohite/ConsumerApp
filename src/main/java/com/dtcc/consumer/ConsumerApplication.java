package com.dtcc.consumer;

import com.dtcc.consumer.service.RuleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
        RuleService service = context.getBean(RuleService.class);
        service.executeRules();
    }

}
