package br.com.neworder.service;

import br.com.neworder.domain.Costumer;
import br.com.neworder.domain.CreditCard;
import br.com.neworder.domain.NewOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class NewOrderService {

    @Value("${kafka.new.order.topic}")
    private String producerNewOrderTopic;

    private KafkaTemplate<String, Object> kafkaTemplate;

    @Autowired
    public NewOrderService(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public String producerNewOrder() {
        NewOrder newOrder = generateNewOrder();
        kafkaTemplate.send(producerNewOrderTopic, newOrder.getId(), newOrder);
        return "Order successfully processed";
    }

    public String producerTenThousandNewOrder() {
        for (int i = 0; i < 10000; i++) {
            NewOrder newOrder = generateNewOrder();
            kafkaTemplate.send(producerNewOrderTopic, newOrder.getId(), newOrder);
            System.out.println(newOrder.getId());
        }
        return "Order successfully processed";
    }

    public String producerTwoMillionNewOrder() {
        for (int i = 0; i < 2000000; i++) {
            NewOrder newOrder = generateNewOrder();
            kafkaTemplate.send(producerNewOrderTopic, newOrder.getId(), newOrder);
        }
        return "Order successfully processed";
    }

    public String producerOneBillionNewOrder() {
        for (int i = 0; i < 1000000000; i++) {
            NewOrder newOrder = generateNewOrder();
            kafkaTemplate.send(producerNewOrderTopic, newOrder.getId(), newOrder);
        }
        return "Order successfully processed";
    }

    private NewOrder generateNewOrder() {
        CreditCard creditCard = new CreditCard("1234.1234.12654-24", LocalDate.now(), 5000d);
        Costumer costumer = new Costumer(1l, "Costumer", creditCard);
        return new NewOrder(UUID.randomUUID().toString(), 10d, LocalDateTime.now(), costumer);
    }
}
