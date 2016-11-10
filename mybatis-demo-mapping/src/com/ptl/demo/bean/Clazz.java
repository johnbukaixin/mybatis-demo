package com.ptl.demo.bean;

import java.io.Serializable;
import java.util.List;

public class Clazz implements Serializable{

	private int clazzId;
	private String clazzName;
	private List<Student> students;
	public int getClazzId() {
		return clazzId;
	}
	public void setClazzId(int clazzId) {
		this.clazzId = clazzId;
	}
	public String getClazzName() {
		return clazzName;
	}
	public void setClazzName(String clazzName) {
		this.clazzName = clazzName;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Clazz [clazzId=" + clazzId + ", clazzName=" + clazzName + ", students=" + students + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + clazzId;
		result = prime * result + ((clazzName == null) ? 0 : clazzName.hashCode());
		result = prime * result + ((students == null) ? 0 : students.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clazz other = (Clazz) obj;
		if (clazzId != other.clazzId)
			return false;
		if (clazzName == null) {
			if (other.clazzName != null)
				return false;
		} else if (!clazzName.equals(other.clazzName))
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}
	
	
	
	
}
