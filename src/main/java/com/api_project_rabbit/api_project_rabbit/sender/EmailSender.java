package com.api_project_rabbit.api_project_rabbit.sender;

import com.api_project_rabbit.api_project_rabbit.models.Dados;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.queue}")
    private String queue;

    public void send(Dados dados) {
        rabbitTemplate.convertAndSend(queue, dados);
    }
}
