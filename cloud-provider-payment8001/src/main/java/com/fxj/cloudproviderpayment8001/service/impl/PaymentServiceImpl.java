package com.fxj.cloudproviderpayment8001.service.impl;

import com.fxj.cloudproviderpayment8001.dao.PaymentDao;
import com.fxj.cloudproviderpayment8001.entity.Payment;
import com.fxj.cloudproviderpayment8001.service.PaymentService;
import com.fxj.commons.result.Result;
import com.fxj.commons.result.StatusCode;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Result<String> insert(Payment payment) {
        int result = paymentDao.insert(payment);
        if (result == 1)
            return new Result<String>(StatusCode.SUCCESS,"成功");
        else
            return new Result<String>(StatusCode.FAIL,"失败");
    }

    @Override
    public Result<Payment> findById(Long id) {
        Payment payment = paymentDao.selectById(id);
        return new Result<Payment>(StatusCode.SUCCESS,"成功",payment);
    }
}
