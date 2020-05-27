package com.bix.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bix.ProfileDTO;

///       <bean  id="bizDao" class="com.bix.da.BizDaoImpl">
//</bean>

@Repository("bizDao")
public class BizDaoImpl {
	
	/*@Autowired
	//@Qualifier("pkDataSource")
	private DataSource dataSource;
	*/
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public String saveProfile(ProfileDTO profileDTO) {
		Timestamp timestamp=new Timestamp(new Date().getTime());
		Object[] data=new Object[] {profileDTO.getUsername(),profileDTO.getPassword(),profileDTO.getName(),
				profileDTO.getEmail(),profileDTO.getGender(),profileDTO.getImage(),timestamp};
		
		jdbcTemplate.update("insert into profiles_tbl(username,password,name,email,gender,photo,doe)  values(?,?,?,?,?,?,?);",data);
		return "saved";
	}
	
	public void foo(String email) {
		System.out.println("Hey I am foo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(email);
		System.out.println("Hey I am foo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

}
