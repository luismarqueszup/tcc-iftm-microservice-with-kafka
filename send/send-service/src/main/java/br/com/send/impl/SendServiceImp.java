package br.com.send.impl;

import br.com.send.contract.SendService;
import br.com.send.domain.NewOrder;
import br.com.send.helper.MapperHelp;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SendServiceImp implements SendService {

    private MapperHelp mapperHelp;

    @Autowired
    public SendServiceImp(MapperHelp mapperHelp) {
        this.mapperHelp = mapperHelp;
    }


    @KafkaListener(topics = {"${kafka.payment.successfully.topic}"}, groupId = "${kafka.new.payment.group}")
    private void listen(ConsumerRecord<String, Object> record) throws IOException {
        processSend(mapperHelp.mapperJsonToObject(record.value().toString(), NewOrder.class));
    }

    @Override
    public void processSend(NewOrder newOrder) {
        System.out.println("---------New payment received: Preparing shipment---------");
        System.out.println(newOrder);
    }
}
