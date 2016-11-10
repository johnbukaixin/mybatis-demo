package com.ptl.demo.mapper;

import java.util.List;

import com.ptl.demo.bean.Student;

public interface StudentMapper {

	List<Student> getStudents();
	List<Student> getStudentByClazzId(int clazzId);
}
