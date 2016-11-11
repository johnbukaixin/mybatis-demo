package com.ptl.demo.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ptl.demo.bean.Developer;
import com.ptl.demo.mapper.DeveloperMapper;
import com.ptl.demo.util.DMU;

public class Test {

	public static void main(String[] args) {
		
		SqlSession session=DMU.openSession();
		DeveloperMapper developerMapper=session.getMapper(DeveloperMapper.class);
		List<Developer> developers=developerMapper.getDevelopers();
		session.close();
		for (Developer developer : developers) {
			System.out.println(developer);
			System.out.println(developer.getProjects());
		}
	}
}
