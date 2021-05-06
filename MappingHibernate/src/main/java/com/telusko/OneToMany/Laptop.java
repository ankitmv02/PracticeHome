package com.telusko.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String lname;
	@ManyToOne
	private Student stu;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Student getStu() {
		return stu;
	}
	public void setStudent(Student stu) {
		this.stu = stu;
	}
	
}
