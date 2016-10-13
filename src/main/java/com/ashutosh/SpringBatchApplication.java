package com.ashutosh;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class SpringBatchApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringBatchApplication.class, args);
//		System.out.println(" ctx obtained");
//		
//		String[] beanNames = ctx.getBeanDefinitionNames();
//		Arrays.sort(beanNames);
//		for(String beanName: beanNames){
//			System.out.println("beanName::"+beanName);
//		}
//		
		System.out.println("Done.");
	}
}
