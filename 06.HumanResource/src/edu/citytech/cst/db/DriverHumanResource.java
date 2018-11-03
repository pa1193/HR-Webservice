package edu.citytech.cst.db;
import java.sql.*;

public class DriverHumanResource {
	   static final String DB_URL = "jdbc:derby://localhost:9215/c:/data/humanresource;create=false";

	   //  Database credentials
	   static final String USER = "username";
	   static final String PASS = "password";
	   
	   public static void main(String[] args) {
	 
	   //try catch resource 
	   try (Connection conn = DriverManager.getConnection(DB_URL)){
		   String sql = "select name,jobTitle_salary, status from employees where jobTitle_salary > 125000";
		   
		   PreparedStatement statement = conn.prepareStatement(sql);
		   ResultSet rs = statement.executeQuery();
		   while (rs.next()) {
			   String name = rs.getString("name");
			   String status = rs.getString("status");
			   float salary = rs.getFloat("jobTitle_salary");
			   
			   System.out.println("Name: " +name + " \nStatus: " + status + " \nSalary: " + salary + " \n\n");
		   }
		   
	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	     
	      System.out.println("Connected database successfully...");
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }
	   System.out.println("Good Bye!");
	   }
}
