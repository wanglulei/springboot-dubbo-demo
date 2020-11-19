package com.example.dubbo.dubbocustomer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.dubboapi.service.ITestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @ClassName TestController
 * @Description
 * @Author wanglulei
 * @Date 2020/11/19  15:12
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private ITestService testService;

    @GetMapping("/sayHello")
    public String sayHello(@RequestParam String name){
        return testService.sayHello(name);
    }
}