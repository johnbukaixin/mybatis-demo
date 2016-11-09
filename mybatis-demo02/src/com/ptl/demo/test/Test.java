package com.ptl.demo.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ptl.demo.bean.Module;
import com.ptl.demo.mapper.ModuleMapper;
import com.ptl.demo.util.DMU;

public class Test {

	public static void main(String[] args) {
		SqlSession session=DMU.openSession();
		
		ModuleMapper mDao=session.getMapper(ModuleMapper.class);
//		List<Module> modules=mDao.getModules();
//		
//		for (Module module : modules) {
//			System.out.println(module);
//		}
		Module module=new Module();
		module.setModuleCode("M006");
		module.setModuleName("nihao");
		module.setIsNew(1);
		module.setModuleId(8);
		mDao.updateModuleById(module);
	}
}
