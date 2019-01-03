package com.zqh.config;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import com.alibaba.dubbo.rpc.cluster.Configurator;

import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;

/**
 * @discription:
 * @date: 2019/01/03 下午4:41
 */
@EnableDubboConfig
@PropertySource("dubbo/dubbo.properties")
@DubboComponentScan("com.zqh")
@Configuration
public class DubboConfiguration {

}
