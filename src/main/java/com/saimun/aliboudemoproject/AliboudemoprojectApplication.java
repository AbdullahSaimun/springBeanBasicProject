package com.saimun.aliboudemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AliboudemoprojectApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(AliboudemoprojectApplication.class, args);
//		MyFirstClassNew myFirstClassNew = ctx.getBean(MyFirstClassNew.class,"myFirstClassNew");
		MyFirstClassNew myFirstClassNew = (MyFirstClassNew) ctx.getBean("beanNameFromMyFristClass");
//		MyFirstClassNew myFirstClassNew = ctx.getBean(MyFirstClassNew.class);
		System.out.println(myFirstClassNew.sayHello());
	}



}
