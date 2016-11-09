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
		module.setIsNew(1);
		module.setModuleCode("M007");
		module.setModuleName("¹þ¹þ");
		try {
			
			int rowNum=mapper.saveModuleById(module);
			System.out.println(rowNum);
			System.out.println(module.getModuleId());
			session.commit();
		} catch (Exception e) {
			if(session!=null)
			session.rollback();
			e.printStackTrace();
		}finally{
			session.close();
		}
		
	}
}
