package com.bix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bix.service.BizServiceImpl;

public class SaveProfileAnnoSpring {
	
	public static void main(String[] args) {
		//creating spring container
		ApplicationContext   ac=new ClassPathXmlApplicationContext("biz-service-anno.xml");
		BizServiceImpl bizServiceImpl=(BizServiceImpl)ac.getBean("bizSe");
		
		ProfileDTO profileDTO=new ProfileDTO();
		profileDTO.setEmail("nagn@gmail.com");
		profileDTO.setGender("Male");
		profileDTO.setImage("www.");
		profileDTO.setName("Amogha");
		profileDTO.setPassword("chill");
		profileDTO.setRole("customer");
		profileDTO.setUsername("owuiee");
		bizServiceImpl.saveData(profileDTO);
		System.out.println("Thank you");
	}

}
