package org.york.sm.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName: GoodsApplication
 * @Description: TODO
 * @Create by: zhouyang
 * @Date: 2021/1/15 10:35 下午
 */
@SpringBootApplication
@EnableEurekaClient//开启eureka 客户端
@MapperScan(basePackages = {"org.sm.mall.goods.mapper"}) //mapper扫描
public class GoodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsApplication.class, args);
    }
}
