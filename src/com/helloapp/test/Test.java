package com.helloapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.helloapp.beans.HelloBean;

public class Test {

	public static void main(String[] args)throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/helloapp/resources/applicationContext.xml");
		HelloBean hello = (HelloBean)context.getBean("helloBean"); 
		System.out.println(hello.sayHello());
	}

}
