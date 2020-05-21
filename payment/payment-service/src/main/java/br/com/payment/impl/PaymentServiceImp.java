package br.com.payment.impl;

import br.com.payment.helper.MapperHelp;
import br.com.payment.contract.PaymentService;
import br.com.payment.domain.NewOrder;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PaymentServiceImp implements PaymentService {

    @Value("${kafka.payment.successfully.topic}")
    private String producerNewPaymentSuccessfully;

    private KafkaTemplate kafkaTemplate;
    private MapperHelp mapperHelp;

    @Autowired
    public PaymentServiceImp(KafkaTemplate kafkaTemplate, MapperHelp mapperHelp) {
        this.kafkaTemplate = kafkaTemplate;
        this.mapperHelp = mapperHelp;
    }

    @KafkaListener(topics = {"${kafka.new.order.topic}"}, groupId = "${kafka.new.order.group}")
    private void listen(ConsumerRecord<String, Object> record) throws IOException {
        processPayment(mapperHelp.mapperJsonToObject(record.value().toString(), NewOrder.class));
    }

    @Override
    public void processPayment(NewOrder newOrder) {
        System.out.println("---------New Order consumer: Starting payment---------");
        System.out.println(newOrder);
        System.out.println("---------Payment processed successfully---------");
        kafkaTemplate.send(producerNewPaymentSuccessfully, newOrder.getId(), newOrder);
    }
}
