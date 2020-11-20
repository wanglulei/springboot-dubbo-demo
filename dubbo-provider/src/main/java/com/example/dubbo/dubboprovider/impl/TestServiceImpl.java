package com.example.dubbo.dubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.dubboapi.service.ITestService;
import com.example.dubbo.dubboapi.vo.TestVo;


/**
 * @ClassName TestServiceImpl
 * @Description
 * @Author wanglulei
 * @Date 2020/11/19  15:04
 **/
public class TestServiceImpl implements ITestService {
    @Override
    public TestVo sayHello(String name) {
        TestVo testVo = new TestVo();
        testVo.setName(name);
        return testVo;
    }
}