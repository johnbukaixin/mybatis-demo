package com.ptl.demo.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.javassist.bytecode.analysis.MultiArrayType;
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
//		Module module=new Module();
//		module.setModuleCode("aaa");
//		module.setModuleName("hhh");
//		module.setIsNew(0);
		Map<String, Object> mapParam=new HashMap<>();
		mapParam.put("code", "M001");
		Module m=mDao.getModuleByParam(mapParam);
		System.out.println(m);
	}
}
