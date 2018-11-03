package edu.citytech.cst.rest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.citytech.cst.model.Developer;

@RestController
public class AboutMeController {
	@RequestMapping("/aboutme")
public String  whoAmI() {
	return "birkelund.paul the tall";
}
	@RequestMapping("/detail")
	public Developer detail() {
		ArrayList<String> skills = new ArrayList<>();
		skills.add("SQL");
		skills.add("Java");
		skills.add("XML");
		skills.add("HTML");
		skills.add("JavaScript");
		skills.add("CSS");
		String name = "Birkelund, Paul";
		return new Developer(name, skills);
	}
	
	
}
