package com.example.dubbo.dubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.dubboapi.service.ITestService;


/**
 * @ClassName TestServiceImpl
 * @Description
 * @Author wanglulei
 * @Date 2020/11/19  15:04
 **/
public class TestServiceImpl implements ITestService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}