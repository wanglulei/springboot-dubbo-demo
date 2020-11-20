package com.example.dubbo.dubboapi.service;

import com.example.dubbo.dubboapi.vo.TestVo;
import org.springframework.stereotype.Service;

/**
 * @ClassName ITestService
 * @Description
 * @Author wanglulei
 * @Date 2020/11/19  15:04
 **/
@Service
public interface ITestService {
    TestVo sayHello(String name);
}
