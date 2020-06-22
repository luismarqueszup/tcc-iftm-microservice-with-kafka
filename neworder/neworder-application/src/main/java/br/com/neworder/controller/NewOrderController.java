package br.com.neworder.controller;

import br.com.neworder.api.NewOrderApi;
import br.com.neworder.service.NewOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewOrderController implements NewOrderApi {

    private NewOrderService newOrderService;

    @Autowired
    public NewOrderController(NewOrderService newOrderService) {
        this.newOrderService = newOrderService;
    }

    @Override
    public String send() {
        return newOrderService.producerNewOrder();
    }

    @Override
    public String sendTenThousand() {
        return newOrderService.producerTenThousandNewOrder();
    }

    @Override
    public String sendTwoMillion() {
        return newOrderService.producerTwoMillionNewOrder();
    }

    @Override
    public String sendOneBillion() {
        return newOrderService.producerOneBillionNewOrder();
    }
}
