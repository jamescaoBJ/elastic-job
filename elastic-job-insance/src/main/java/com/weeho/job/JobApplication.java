package com.weeho.job;

import java.util.concurrent.CountDownLatch;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import com.weeho.elasticjob.annotation.EnableElasticJob;

/**
 * ElasticJob Spring Boot集成案例
 * 
 *
 */
@SpringBootApplication
@EnableElasticJob
//开启动态任务添加API
@ComponentScan(basePackages = {"com.weeho"})
public class JobApplication {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(JobApplication.class).web(true).run(args);
		try {
			new CountDownLatch(1).await();
		} catch (InterruptedException e) {
		}
	}
	
}
