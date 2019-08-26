package io.daocloud.shop.admin.controller.v1.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tianpeidong
 * @version 创建时间: 19-8-26 下午1:54
 */
@Configuration
public class RabbitmqConfig {

    public static final String QUEUE_NAME = "spring-boot-simple";

    @Bean
    public Queue queue() {
        return new Queue(QUEUE_NAME);
    }
}
