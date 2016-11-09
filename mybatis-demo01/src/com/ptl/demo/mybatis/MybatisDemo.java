package com.ptl.demo.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.ptl.demo.bean.Module;
import com.ptl.demo.util.DMU;

public class MybatisDemo {

	public static void main(String[] args) throws IOException {
//		InputStream inputStream=Resources.getResourceAsStream("mybatis.cfg.xml");
//		SqlSessionFactoryBuilder sessionFactoryBuilder=new SqlSessionFactoryBuilder();
//		SqlSessionFactory sessionFactory=sessionFactoryBuilder.build(inputStream);
//		SqlSession session=sessionFactory.openSession();
		SqlSession session=DMU.openSession();
		//映射文件包名+id
//		List<Module> lists=session.selectList("com.ptl.demo.selectModule");
		Map<String, Module> map=session.selectMap("com.ptl.demo.selectModule", "moduleName");
		session.close();
//		for (Module module : lists) {
//			System.out.println(module);
//		}
		for (String string : map.keySet()) {
			System.out.println(string+map.get(string));
		}
	}
}
