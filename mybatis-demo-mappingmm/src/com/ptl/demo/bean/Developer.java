package com.ptl.demo.bean;

import java.io.Serializable;
import java.util.List;

public class Developer implements Serializable{

//	`did` int(11) NOT NULL AUTO_INCREMENT,
//	  `dname` varchar(255) DEFAULT NULL,
	
	private int did;
	private String dname;
	private List<Project> projects;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Developer [did=" + did + ", dname=" + dname + ", projects=" + projects + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + did;
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
		result = prime * result + ((projects == null) ? 0 : projects.hashCode());
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
		Developer other = (Developer) obj;
		if (did != other.did)
			return false;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
			return false;
		if (projects == null) {
			if (other.projects != null)
				return false;
		} else if (!projects.equals(other.projects))
			return false;
		return true;
	}
	
	
}
