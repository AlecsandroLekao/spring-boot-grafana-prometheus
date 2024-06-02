package com.api_project_rabbit.api_project_rabbit.consumer;

import com.api_project_rabbit.api_project_rabbit.models.Dados;
import com.api_project_rabbit.api_project_rabbit.services.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload Dados dados){
        System.out.println("Rabbit listener");
    }
}
