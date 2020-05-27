package com.bix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bix.ProfileDTO;
import com.bix.dao.BizDaoImpl;

/**
 * <bean id="bizSe" class="com.bix..service.BizServiceImpl">
 * <property name="email" value="nagen@gmail.com"/>
 * <property name="bizDaoImpl" ref="bizDao"/> </bean>
 */

@Service("bizSe")
public class BizServiceImpl {
	
	@Autowired
	private BizDaoImpl bizDaoImpl;
	
	private String email="nagen@gmail.com";
	
	public BizDaoImpl getBizDaoImpl() {
		return bizDaoImpl;
	}
	public void setBizDaoImpl(BizDaoImpl bizDaoImpl) {
		this.bizDaoImpl = bizDaoImpl;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void saveData(ProfileDTO profileDTO) {
		bizDaoImpl.saveProfile(profileDTO);
	}

	public void show() {
		System.out.println("_________show_BizServiceImpl________");
		bizDaoImpl.foo(email);
	}

}
