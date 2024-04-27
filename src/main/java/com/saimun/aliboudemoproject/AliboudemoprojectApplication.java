package com.saimun.aliboudemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AliboudemoprojectApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(AliboudemoprojectApplication.class, args);
		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
		System.out.println(myFirstService.getJavaVersion());
		System.out.println(myFirstService.getOsName());
		System.out.println(myFirstService.getFullName());
	}



}
