package com.jimmy;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * Created by Administrator on 2019/4/10/010.
 */
//@EnableEurekaServer//启动eureka的配置功能
//@EnableApolloConfig //启动配置中心

@SpringBootApplication
@EnableTransactionManagement//表示启动事务
//@MapperScan("mybatis.mapper")//与在class上加上@mapper意义一样，扫描对应的mapper.xml
//@ComponentScan(basePackages={"com.jimmy"})//spring-boot中扫描包的位置.默认的情况下扫描该启动类所在的包
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
