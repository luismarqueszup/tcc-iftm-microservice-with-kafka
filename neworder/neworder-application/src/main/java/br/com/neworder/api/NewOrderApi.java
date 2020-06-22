package br.com.neworder.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Api("/Ecommerce")
@RequestMapping("/newOrder")
public interface NewOrderApi {


    @ApiOperation("Create new order")
    @PostMapping("/send")
    @ResponseStatus(HttpStatus.OK)
    public String send();

    @ApiOperation("Create Ten thousand new order")
    @PostMapping("/sendTenThousand")
    @ResponseStatus(HttpStatus.OK)
    public String sendTenThousand();

    @ApiOperation("Create two million new order")
    @PostMapping("/sendTwoMillion")
    @ResponseStatus(HttpStatus.OK)
    public String sendTwoMillion();

    @ApiOperation("Create one billion new order")
    @PostMapping("/sendOneBillion")
    @ResponseStatus(HttpStatus.OK)
    public String sendOneBillion();
}
