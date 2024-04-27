package com.saimun.aliboudemoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstServiceForCustomProperties {

	private MyFirstClassNew myFirstClassNew;
	private Environment environment;

	@Value("${my.name.full.name}")
	private String myNameFromCustomProperties;


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

	public String getPropertyName() {
		return STR."name from property \{myNameFromCustomProperties}";
	}




}
