package com.test.springapiusingjpa.controller;

import com.test.springapiusingjpa.dao.OrdersRepository;
import com.test.springapiusingjpa.domain.ResultOV;
import com.test.springapiusingjpa.utils.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrdersController {
    @Resource
    private OrdersRepository ordersRepository;

    @GetMapping("/getOrders")
    public ResultOV getOrders(Integer oid) {
        return ResultUtils.success(ordersRepository.findByOrdersOid(oid));
    }
}
