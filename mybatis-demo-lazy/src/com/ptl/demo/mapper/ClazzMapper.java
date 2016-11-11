package com.ptl.demo.mapper;

import java.util.List;

import com.ptl.demo.bean.Clazz;
import com.ptl.demo.bean.Student;

public interface ClazzMapper {

	List<Clazz> getClazzs();
	
	Clazz getClazzById(int clazzId);
}
