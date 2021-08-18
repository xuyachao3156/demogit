package com.icoom.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明是一个 spring boot 应用
 *
 * 标注在某个类说明这个类是springBoot主配置类
 * springBoot 就应该运行这个类的main方法来启动springBoot应用
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


    }

}
