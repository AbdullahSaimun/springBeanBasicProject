package com.saimun.aliboudemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class AliboudemoprojectApplication {

	public static void main(String[] args) {
		var app = new SpringApplication(AliboudemoprojectApplication.class);
		app.setDefaultProperties(Collections.singletonMap("spring.profiles.active","dev"));
		var ctx = app.run( args);
		MyFirstServiceForCustomProfiles myFirstService = ctx.getBean(MyFirstServiceForCustomProfiles.class);
		System.out.println(myFirstService.getPropertyName());

	}



}
