package com.zqh.config;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.zqh.dubbo.service.EchoService;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @discription:
 * @date: 2019/01/03 下午4:41
 */
@EnableDubboConfig
@PropertySource("dubbo/dubbo.properties")
@DubboComponentScan("com.zqh")
@ComponentScan("com.zqh")
@Configuration
public class DubboConfiguration {



}
