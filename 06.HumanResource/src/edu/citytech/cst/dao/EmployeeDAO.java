package edu.citytech.cst.dao;
import java.util.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import edu.citytech.cst.model.*;
public class EmployeeDAO {
	  static final String DB_URL = "jdbc:derby://localhost:9215/c:/data/humanresource;create=false";
	public List<employee> findALL() {
		return this.findBy(new HashMap<String,Object>());
		   }
	
	public List<employee> findBy(Map<String, Object> parameters) {
		   //try catch resource 
		   try (Connection conn = DriverManager.getConnection(DB_URL)){
			   
			 
			   String sql = "select * from employees where 1 = 1 ";
			   if(parameters.containsKey("status")) {
					  sql = sql + " and status = '" + parameters.get("status")+"'";
				  }
			   if(parameters.containsKey("gender")) {
					  sql = sql + " and gender = '" + parameters.get("gender")+"'";
				  }
			   if(parameters.containsKey("isActive")) {
				   sql = sql + " and isActive = '" + parameters.get("isActive")+"'";
			   }
			   if(parameters.containsKey("county")) {
				   sql = sql + " and county = '" + parameters.get("county")+"'";
			   }if(parameters.containsKey("salaryGT")) {
				   sql = sql + " and jobTitle_salary > " + parameters.get("salaryGT")+"";
			   }
			   if(parameters.containsKey("statusM")) {
				   String []x = (String[]) parameters.get("statusM");
				
				   String inClause = "";
				   String comma = "";
				   int size = x.length;
				   for (String string : x) {
					inClause = inClause + comma +"'"+string+"'";
					comma = ",";
				}
				   inClause = " and status in(" + inClause+")";
				   sql = sql + inClause;
				   System.out.println(sql);
				  // return new ArrayList<>();
			   }
			   if(parameters.containsKey("salaryBT")) {
				   float []x = (float[]) parameters.get("salaryBT");
				   
				   sql = sql + " and jobTitle_salary BETWEEN " + x[0] +" and "+ x[1]+"";
			   }
			   if(parameters.containsKey("firstNameStartWith")) {
				  // sql = sql +" and CHARINDEX(' ',"+parameters.get("lastNameStartWith")+") = 0"
				   sql = sql + " and name like '" + parameters.get("firstNameStartWith")+"%'";
				   
			   }
			   if(parameters.containsKey("empID")) {
				   sql = sql + " and employeeId = " + parameters.get("empID")+"";

			   }
			   PreparedStatement statement = conn.prepareStatement(sql);
			   ResultSet rs = statement.executeQuery();
			   List<employee> list = new ArrayList<>();
			   while (rs.next()) {
				   String name = rs.getString("name");
				   String status = rs.getString("status");
				   float salary = rs.getFloat("jobTitle_salary");
				   String gender = rs.getString("gender");
				   boolean isActive = rs.getString("isActive").equals("Y") ? true : false;
				   String county = rs.getString("county");
				   int employeeId = rs.getInt("employeeId");
				   Date hireDate = rs.getDate("hireDate");
				   String jobTitle = rs.getString("jobTitle_job");
				employee e = new employee(employeeId, name, status, county, hireDate, isActive, jobTitle, salary, gender);
				list.add(e);
			   }
			   return list;
			   
		     
		     
		     
		    
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }
		 return null;
	}
	}


