package com.zqh.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.stereotype.Component;

/**
 * @discription:
 * @date: 2019/01/03 下午7:45
 */
@Component
public class EchoServiceIntegration {

    @Reference(interfaceClass = EchoService.class)
    private EchoService echoService;

    public String echo(String msg) {
        return echoService.echo(msg);
    }

}
