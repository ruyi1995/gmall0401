package com.atguigu.gmall0401.manage;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;



@SpringBootApplication
public class Gmall0401ManageWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gmall0401ManageWebApplication.class, args);
	}

}
