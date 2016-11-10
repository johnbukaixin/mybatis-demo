package com.ptl.demo.mapper;

import java.util.List;

import com.ptl.demo.bean.Module;

public interface ModuleMapper {
	List<Module> getModules();

	Module getModuleById(Module module);

	int saveModuleById(Module module);

	void updateModuleById(Module module);

	void deleteModuleById(Module module);
}
