package com.saimun.aliboudemoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

	private MyFirstClassNew myFirstClass;

	@Autowired
	public MyFirstService(@Qualifier("first") MyFirstClassNew myFirstClass) {
		this.myFirstClass = myFirstClass;
	}

	public String tellAStory() {
		return STR."dependency injection is saying \{myFirstClass.sayHello()}";
	}
}
