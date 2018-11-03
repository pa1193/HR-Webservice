package edu.citytech.cst.model;

import java.util.List;

public class Developer {
	private String fillName;
	private List<String> skills;
	
	
	
	
	
	public Developer(String fillName, List<String> skills) {
		super();
		this.fillName = fillName;
		this.skills = skills;
	}
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFillName() {
		return fillName;
	}
	public void setFillName(String fillName) {
		this.fillName = fillName;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
}
