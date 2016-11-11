package com.ptl.demo.mapper;

import java.util.List;

import com.ptl.demo.bean.Developer;

public interface DeveloperMapper {

	List<Developer> getDevelopers();
	Developer getDeveloperByPid(int pid);
}
