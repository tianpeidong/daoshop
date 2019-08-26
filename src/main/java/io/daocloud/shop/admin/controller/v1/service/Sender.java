package io.daocloud.shop.admin.controller.v1.service;

import io.daocloud.shop.admin.controller.v1.config.RabbitmqConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tianpeidong
 * @version 创建时间: 19-8-26 下午1:57
 */
@Service
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        System.out.println("send msg...");
        rabbitTemplate.convertAndSend(RabbitmqConfig.QUEUE_NAME, "test");
    }
}
