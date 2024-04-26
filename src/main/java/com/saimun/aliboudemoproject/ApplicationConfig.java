package com.saimun.aliboudemoproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	@Bean(name = "beanNameFromMyFristClass")
	public MyFirstClassNew myFirstClass() {
		return new MyFirstClassNew("saimun");
	}

}
