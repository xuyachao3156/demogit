package com.icoom.demo.config;

import com.icoom.demo.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 当前类是一个配置类，就是替代之前的spring配置文件
 */
@Configuration
public class MyAppConfig {

    // 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean
    public Animal animal(){
        return new Animal();
    }
}
