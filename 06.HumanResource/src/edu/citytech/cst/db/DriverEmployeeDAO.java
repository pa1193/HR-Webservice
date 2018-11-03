package edu.citytech.cst.db;

import java.util.*;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.*;
public class DriverEmployeeDAO {

	public static void main(String[] arg) {
	EmployeeDAO empDAO = new EmployeeDAO();
	List<employee> list=null;
	
	Map<String, Object> parameters = new HashMap<>();
//	parameters.put("status", "HH");
//	parameters.put("gender", "female");
//	parameters.put("isActive", "Y");
//	parameters.put("county", "Brooklyn");
//	parameters.put("salaryGT", 110_000);
//	float [] salary = {137_000, 140_000};
//	parameters.put("salaryBT", salary);
//	String [] status = {"HH","S","MFS"};
//parameters.put("firstNameStartWith","O");
	//parameters.put("empID", 1176);
	list = empDAO.findBy(parameters);
	list.forEach(System.out::println);
	
	}
}
