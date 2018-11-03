package edu.citytech.cst.rest;

import edu.citytech.cst.dao.EmployeeDAO;
import edu.citytech.cst.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanResourceController {
	@RequestMapping("/people")
	public List<employee> people() {
		
		EmployeeDAO empDAO = new EmployeeDAO();
		List<employee> list = empDAO.findALL();
		return list;
	} @RequestMapping("/people/{genderCode}")
	public List<employee> peopleByGender(@PathVariable String genderCode) {
		EmployeeDAO empDAO = new EmployeeDAO();
		Map<String, Object> parameters = new HashMap<>();
		parameters.put("gender", genderCode);
		
		List<employee> list = empDAO.findBy(parameters);
		return list;
	} 

}
