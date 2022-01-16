package com.sun;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring-debug.xml");
		User bean = app.getBean(User.class);
		System.out.println(bean);
		System.out.println("1哈哈");
	}
}
