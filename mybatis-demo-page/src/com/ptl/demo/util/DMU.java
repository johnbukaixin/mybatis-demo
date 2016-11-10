package com.ptl.demo.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DMU {

	private DMU(){
		
	}
	
	private static SqlSessionFactory sessionFactory;
	static{
		try {
			InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
		    SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
		    sessionFactory=builder.build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession openSession(){
		return sessionFactory.openSession();
	}
}
