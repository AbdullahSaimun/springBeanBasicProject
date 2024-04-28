package com.saimun.aliboudemoproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ApplicationConfig {
	@Bean
	@Qualifier("second")
	public MyFirstClassNew myFirstClass() {
		return new MyFirstClassNew("saimun");
	}
	@Bean
//	@Primary
	@Qualifier("first")
	public MyFirstClassNew myFirstClassTwo() {
		return new MyFirstClassNew("salamn");
	}

}
