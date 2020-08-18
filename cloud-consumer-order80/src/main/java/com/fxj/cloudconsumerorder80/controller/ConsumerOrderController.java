package com.fxj.cloudconsumerorder80.controller;

import com.fxj.cloudconsumerorder80.entity.Payment;
import com.fxj.commons.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("consumer")
@Slf4j
public class ConsumerOrderController {

    @Resource
    private RestTemplate restTemplate;

    private static String PARAM_URL = "http://localhost:8001";

    @GetMapping("addPayment")
    public Result<Payment> addPayment(Payment payment){
        return restTemplate.postForObject(PARAM_URL + "/product/addPayment",payment,Result.class);
    }

    @GetMapping("selectPayment/{id}")
    public Result<Payment> selectPaymentById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PARAM_URL + "/product/selectPaymentById/" + id, Result.class);
    }
}
