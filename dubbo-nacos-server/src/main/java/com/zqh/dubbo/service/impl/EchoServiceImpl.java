package com.zqh.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zqh.dubbo.service.EchoService;

/**
 * @discription:
 * @date: 2019/01/03 下午4:37
 */
@Service
public class EchoServiceImpl implements EchoService {

    public EchoServiceImpl() {
        System.out.println("EchoServiceImpl start");
    }

    @Override
    public String echo(String msg) {
        return "receive msg: " + msg;
    }

}
