package com.ef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryMethod {

	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    Simple s = (Simple)ctx.getBean("s");
    s.display();
	}

}
