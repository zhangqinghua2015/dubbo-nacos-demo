package com.zqh;

import com.zqh.config.DubboConfiguration;
import com.zqh.dubbo.service.EchoServiceIntegration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @discription:
 * @date: 2019/01/03 下午7:25
 */
public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        // 创建配置上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册当前配置 Bean
        context.register(DubboConfiguration.class);
        context.refresh();
        EchoServiceIntegration echoService = context.getBean(EchoServiceIntegration.class);
        byte[] bytes = new byte[1024];
        while (true) {
           System.in.read(bytes);
           String s = new String(bytes);
           if ("quit".equals(s)) {
               break;
           }
            System.out.println(echoService.echo(s));
        }
    }

}
