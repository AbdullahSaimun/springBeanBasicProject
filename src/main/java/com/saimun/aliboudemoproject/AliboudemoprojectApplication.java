package com.saimun.aliboudemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AliboudemoprojectApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(AliboudemoprojectApplication.class, args);
		MyFirstServiceForCustomProfiles myFirstService = ctx.getBean(MyFirstServiceForCustomProfiles.class);
		System.out.println(myFirstService.getPropertyName());

	}



}
