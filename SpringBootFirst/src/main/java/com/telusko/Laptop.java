package com.telusko;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {

	private int lid;
	private String company;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", company=" + company + "]";
	}
	
	public void compile() {
		System.out.println("This is compile() from Laptop");
	}
}
