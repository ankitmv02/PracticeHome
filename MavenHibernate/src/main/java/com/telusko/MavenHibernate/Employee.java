package com.telusko.MavenHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int eid;
	private EmployeeName ename;
	private String eaddr;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public EmployeeName getEname() {
		return ename;
	}
	public void setEname(EmployeeName ename) {
		this.ename = ename;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	
	//This toString is for getting the value 
	//If this is not written it will print Hashcode
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eaddr=" + eaddr + "]";
	}
	
}
