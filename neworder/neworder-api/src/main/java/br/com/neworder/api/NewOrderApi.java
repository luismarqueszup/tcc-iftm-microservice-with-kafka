package br.com.neworder.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/NewOrder")
public interface NewOrderApi {

    @PostMapping("/send")
    @ResponseStatus(HttpStatus.OK)
    public String send();

    @PostMapping("/sendTenThousand")
    @ResponseStatus(HttpStatus.OK)
    public String sendTenThousand();

    @PostMapping("/sendTwoBillion")
    @ResponseStatus(HttpStatus.OK)
    public String sendTwoBillion();
}
