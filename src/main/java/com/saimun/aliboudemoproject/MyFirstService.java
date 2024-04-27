package com.saimun.aliboudemoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

	private MyFirstClassNew myFirstClassNew;
	private Environment environment;


//	setter injection
	@Autowired
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

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

	public String getJavaVersion() {
		return environment.getProperty("java.version");
	}
	public String getOsName() {
		return environment.getProperty("os.name");
	}
}
