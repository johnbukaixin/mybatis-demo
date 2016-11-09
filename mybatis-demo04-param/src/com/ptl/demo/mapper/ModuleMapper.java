package com.ptl.demo.mapper;

import java.util.List;
import java.util.Map;

import com.ptl.demo.bean.Module;

public interface ModuleMapper {

	List<Module> getModules();
	
	Module getModuleById(Module module);
	
	int saveModuleById(Module module);
	
	void updateModuleByCode(String moduleCode);
	void updateModuleById(int moduleId);
	void deleteModuleById(int  moduleId);
	
	Module getModuleByParam(Map<String, Object> mapParam);
}
