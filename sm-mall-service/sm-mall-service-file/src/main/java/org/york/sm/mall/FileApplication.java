package org.york.sm.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author by: zhouyang
 * @name: FileApplication
 * @Description: TODO
 * @Date: 2021/1/18 6:53 下午
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //排除数据库自动加载
@EnableEurekaClient//开启eureka 客户端
@MapperScan(basePackages = {"org.sm.mall.file.mapper"}) //mapper扫描
public class FileApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileApplication.class, args);
    }
}
