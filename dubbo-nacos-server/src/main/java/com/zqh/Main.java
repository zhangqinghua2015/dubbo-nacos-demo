package com.zqh;

import com.zqh.config.DubboConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @discription:
 * @date: 2019/01/03 下午4:43
 */
public class Main {

    public static void main(String[] args) throws IOException {
        // 创建配置上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册当前配置 Bean
        context.register(DubboConfiguration.class);
        context.refresh();
        System.out.println("按任意键退出...");
        System.in.read();
    }
}
