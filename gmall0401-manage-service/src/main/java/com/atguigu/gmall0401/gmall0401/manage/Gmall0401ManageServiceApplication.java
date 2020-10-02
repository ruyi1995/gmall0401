package com.atguigu.gmall0401.gmall0401.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.atguigu.gmall0401.gmall0401.manage.mapper")
@SpringBootApplication
@ComponentScan
public class Gmall0401ManageServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gmall0401ManageServiceApplication.class, args);
	}

}
