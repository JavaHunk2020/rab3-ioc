package com.bix;

import com.bix.service.BizServiceImpl;

public class Main {

	public static void main(String[] args) {
		BizServiceImpl bizSe=new BizServiceImpl();
		bizSe.setEmail("nagen@gmail.com");
		bizSe.show();
	}
}
