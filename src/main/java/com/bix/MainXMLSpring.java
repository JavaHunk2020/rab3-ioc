package com.bix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bix.service.BizServiceImpl;

public class MainXMLSpring {
	
	public static void main(String[] args) {
		//creating spring container
		ApplicationContext   ac=new ClassPathXmlApplicationContext("biz-service.xml");
		BizServiceImpl bizServiceImpl=(BizServiceImpl)ac.getBean("bizSe");
		bizServiceImpl.show();
	}

}
