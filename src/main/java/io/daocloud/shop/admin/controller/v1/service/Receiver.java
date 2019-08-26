package io.daocloud.shop.admin.controller.v1.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianpeidong
 * @version 创建时间: 19-8-26 下午1:57
 */
@Service
public class Receiver {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @RabbitListener(queues = "spring-boot-simple")
    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
    }
}