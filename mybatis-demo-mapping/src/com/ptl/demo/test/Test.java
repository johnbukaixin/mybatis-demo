package com.ptl.demo.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.core.util.CachedClock;

import com.ptl.demo.bean.Clazz;
import com.ptl.demo.bean.Student;
import com.ptl.demo.mapper.ClazzMapper;
import com.ptl.demo.mapper.StudentMapper;
import com.ptl.demo.util.DMU;

public class Test {

	public static void main(String[] args) {
		
		SqlSession session=DMU.openSession();
		ClazzMapper clazzMapper=session.getMapper(ClazzMapper.class);
//		List<Clazz> clazzs=clazzMapper.getClazzs();
		
//		StudentMapper studentMapper=session.getMapper(StudentMapper.class);
//		List<Student> students=studentMapper.getStudents();
		Clazz clazz=clazzMapper.getClazzById(1);
		session.close();
		System.out.println(clazz);
		for (Student student : clazz.getStudents()) {
			System.out.println(student);
		}
//		for (Student student : students) {
//			System.out.println(student);
//		}
	}
}
