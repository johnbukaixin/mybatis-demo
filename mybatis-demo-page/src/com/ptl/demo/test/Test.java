package com.ptl.demo.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ptl.demo.bean.Option;
import com.ptl.demo.mapper.OptionMapper;
import com.ptl.demo.util.DMU;

public class Test {

	public static void main(String[] args) {
		SqlSession session=DMU.openSession();
		
		OptionMapper mDao=session.getMapper(OptionMapper.class);
//		List<Module> modules=mDao.getModules();
//		
//		for (Module module : modules) {
//			System.out.println(module);
//		}
		List<Option> options=mDao.getOptions(0,5);
		for (Option option : options) {
			System.out.println(option);
		}
	}
}
