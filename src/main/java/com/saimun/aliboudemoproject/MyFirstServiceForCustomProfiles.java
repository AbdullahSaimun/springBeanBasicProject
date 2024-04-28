package com.saimun.aliboudemoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstServiceForCustomProfiles {

	private MyFirstClassNew myFirstClassNew;
	private Environment environment;

	@Value("${my.custom.property}")
	private String myNameFromCustomProperties;


	@Value("${my.custom.property.int}")
	private Integer myNumber;


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
		return STR."name from property \{myNameFromCustomProperties} and phone number is \{myNumber}";
	}




}
