package com.ptl.demo.mapper;

import java.util.List;

import com.ptl.demo.bean.Project;

public interface ProjectMapper {

	List<Project> getProjects();
	
    Project getProjectByDid(int did);
}
