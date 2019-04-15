package com.jimmy;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by Administrator on 2019/4/10/010.
 */
//@EnableApolloConfig //启动配置中心
@SpringBootApplication
@MapperScan("mybatis.mapper")
//@ComponentScan(basePackages={"com.jimmy"})//spring-boot中扫描包的位置.默认的情况下扫描该启动类所在的包
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
