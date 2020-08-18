package com.fxj.cloudproviderpayment8001.dao;

import com.fxj.cloudproviderpayment8001.entity.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao  extends BaseMapper<Payment> {
}
