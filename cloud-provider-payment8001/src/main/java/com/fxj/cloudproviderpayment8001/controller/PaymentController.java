package com.fxj.cloudproviderpayment8001.controller;

import com.fxj.cloudproviderpayment8001.entity.Payment;
import com.fxj.cloudproviderpayment8001.service.PaymentService;
import com.fxj.commons.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("product")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    /**
     * 新增一个订单
     * @param payment
     * @return
     */
    @PostMapping(value = "addPayment")
    public Result<String> addPayment(@RequestBody Payment payment){
        return paymentService.insert(payment);
    }

    /**
     * 根据订单ID查询订单
     * @param id
     * @return
     */
    @GetMapping(value = "selectPaymentById/{id}")
    public Result<Payment> selectPaymentById(@PathVariable("id") Long id){
        return paymentService.findById(id);
    }
}
