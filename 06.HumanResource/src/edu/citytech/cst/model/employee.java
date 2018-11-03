package edu.citytech.cst.model;

import java.sql.Date;

public class employee {
	private int employeeId;
	private String name;
	private String status;
	private String county;
	private Date hireDate;
	private boolean isActive;
	private String jobTitle;
	private float salary;
	private String gender;
	public employee(int employeeId, String name, String status, String county, Date hireDate, boolean isActive,
			String jobTitle_job, float jobTitle_salary, String gender) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.status = status;
		this.county = county;
		this.hireDate = hireDate;
		this.isActive = isActive;
		this.jobTitle = jobTitle_job;
		this.salary = jobTitle_salary;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "employee [employeeId=" + employeeId + ", name=" + name + ", status=" + status + ", county=" + county
				+ ", hireDate=" + hireDate + ", isActive=" + isActive + ", jobTitle=" + jobTitle + ", salary=" + salary
				+ ", gender=" + gender + ", getEmployeeId()=" + getEmployeeId() + ", getName()=" + getName()
				+ ", getStatus()=" + getStatus() + ", getCounty()=" + getCounty() + ", getHireDate()=" + getHireDate()
				+ ", getIsActive()=" + getIsActive() + ", getJobTitle_job()=" + getJobTitle_job()
				+ ", getJobTitle_salary()=" + getJobTitle_salary() + ", getGender()=" + getGender() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getJobTitle_job() {
		return jobTitle;
	}
	public void setJobTitle_job(String jobTitle_job) {
		this.jobTitle = jobTitle_job;
	}
	public float getJobTitle_salary() {
		return salary;
	}
	public void setJobTitle_salary(float jobTitle_salary) {
		this.salary = jobTitle_salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
