package com.example.dubbo.dubboapi.vo;

import java.io.Serializable;

/**
 * @ClassName TestVo
 * @Description
 * @Author wanglulei
 * @Date 2020/11/20  17:42
 **/
public class TestVo implements Serializable {

    private String Name;

    public TestVo() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}