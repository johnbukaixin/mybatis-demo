package com.ptl.demo.bean;

import java.io.Serializable;
import java.util.List;

public class Project implements Serializable{

//	`pid` int(11) NOT NULL AUTO_INCREMENT,
//	  `pname` varchar(255) DEFAULT NULL,
	
	private int pid;
	private String pname;
	
	private List<Developer> developers;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", developers=" + developers + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((developers == null) ? 0 : developers.hashCode());
		result = prime * result + pid;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
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
		Project other = (Project) obj;
		if (developers == null) {
			if (other.developers != null)
				return false;
		} else if (!developers.equals(other.developers))
			return false;
		if (pid != other.pid)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		return true;
	}
	
	
	
}
