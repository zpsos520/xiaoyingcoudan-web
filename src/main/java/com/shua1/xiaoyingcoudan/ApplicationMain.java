package com.shua1.xiaoyingcoudan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages={"com.shua1.xiaoyingcoudan.web.controller"})
public class ApplicationMain {
	
	private static final Logger log = LoggerFactory.getLogger(ApplicationMain.class);
	

	public static void main(String[] args) {
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>SaaS WEB服务启动中...");
		
		ApplicationContext applicationContext = SpringApplication.run(ApplicationMain.class, args);
		
		log.info("");
		log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>SaaS WEB服务启动成功 (^_^)");
	}
}
