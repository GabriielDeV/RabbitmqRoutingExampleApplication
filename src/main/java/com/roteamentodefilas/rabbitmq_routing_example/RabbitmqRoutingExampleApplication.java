package com.roteamentodefilas.rabbitmq_routing_example;

import com.roteamentodefilas.rabbitmq_routing_example.consumer.ReceiveLogsDirect;
import com.roteamentodefilas.rabbitmq_routing_example.producer.EmitLogDirect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqRoutingExampleApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(RabbitmqRoutingExampleApplication.class, args);

        String[] receiveArgs = {"info", "warning", "error"};
        ReceiveLogsDirect.main(receiveArgs);

        String[] emitArgs = {"info", "Hello from Gabriel Xavier Cabral"};
        EmitLogDirect.main(emitArgs);
    }
}