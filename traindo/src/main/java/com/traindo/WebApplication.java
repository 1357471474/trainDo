package com.traindo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
// 扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.traindo.mapper")
// 扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
@ComponentScan(basePackages = { "com.traindo"})
// 开启定时任务
@EnableScheduling
// 开启异步调用方法
@EnableAsync
// 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@EnableTransactionManagement
//开启spring的缓存机制
@EnableCaching
public class WebApplication {
	private static final Logger log = LoggerFactory.getLogger(WebApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		log.info("Application start success！");
	}
	
}
