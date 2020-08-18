package com.fxj.cloudproviderpayment8001.service;

import com.fxj.cloudproviderpayment8001.entity.Payment;
import com.fxj.commons.result.Result;

public interface PaymentService {

    Result<String> insert(Payment payment);

    Result<Payment> findById(Long id);
}
