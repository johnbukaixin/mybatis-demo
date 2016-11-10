package com.ptl.demo.test;


import org.apache.ibatis.session.SqlSession;

import com.ptl.demo.bean.Module;
import com.ptl.demo.mapper.ModuleMapper;
import com.ptl.demo.util.DMU;

public class Test {

	public static void main(String[] args) {
		SqlSession session=DMU.openSession();
		ModuleMapper mapper=session.getMapper(ModuleMapper.class);
		Module module=new Module();
	    module.setModuleCode("M003");
	   Module module2= mapper.getModuleById(module);
	   System.out.println(module2);
		
//		module.setIsNew(0);
//		module.setModuleName("test");
//		module.setModuleId(17);
//		mapper.updateModuleById(module);
//		
	}
}
