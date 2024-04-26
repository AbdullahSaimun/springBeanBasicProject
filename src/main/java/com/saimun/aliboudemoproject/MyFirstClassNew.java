package com.saimun.aliboudemoproject;


import org.springframework.stereotype.Component;

@Component
public class MyFirstClassNew {

	private String myVariable;

	public MyFirstClassNew(String myVariable) {
		this.myVariable = myVariable;
	}

	public MyFirstClassNew(){}

	public String getMyVariable() {
		return myVariable;
	}

	public void setMyVariable(String myVariable) {
		this.myVariable = myVariable;
	}

	public String sayHello() {
		return "Hello from the MyFirstClass and variable is " + this.myVariable;
	}
}
