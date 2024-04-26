package com.saimun.aliboudemoproject;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MyFirstClassNew {
	public String sayHello() {
		return "Hello from the MyFirstClass";
	}
}
