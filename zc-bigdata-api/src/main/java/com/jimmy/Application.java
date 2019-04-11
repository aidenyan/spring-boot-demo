package com.jimmy;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by Administrator on 2019/4/10/010.
 */
//@EnableApolloConfig //启动配置中心是需要用到
@SpringBootApplication
@MapperScan("mybatis.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}
