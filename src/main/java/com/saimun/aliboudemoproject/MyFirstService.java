package com.saimun.aliboudemoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

	private MyFirstClassNew myFirstClassNew;


//	method injection
	@Autowired
	public void injectDependencies(@Qualifier("first") MyFirstClassNew myFirstClassNew) {
		this.myFirstClassNew = myFirstClassNew;
	}

/*	field injection
	@Autowired
	@Qualifier("first")
	private MyFirstClassNew myFirstClass;*/

/*	construction injection
	@Autowired
	public MyFirstService(@Qualifier("first") MyFirstClassNew myFirstClass) {
		this.myFirstClass = myFirstClass;
	}*/

	public String tellAStory() {
		return STR."dependency injection is saying \{myFirstClassNew.sayHello()}";
	}
}
