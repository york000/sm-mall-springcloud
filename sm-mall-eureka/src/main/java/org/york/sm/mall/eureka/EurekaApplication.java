package org.york.sm.mall.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author :york
 * @date 2021/1/14
 * @deprecated eureka 服务
 */
@SpringBootApplication
@EnableEurekaServer /* 开启Eureka服务 */

public class EurekaApplication {
    /**
     * 加载启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
