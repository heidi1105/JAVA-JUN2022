package com.heidichen.firstjsp.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//localhost:8080/home
	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/jstl")
	public String jstlDemo(Model model) {
		String petName = "Stitch";
		Integer age = 2;

		model.addAttribute("jspPetName", petName);
		model.addAttribute("jspAge", age);
		model.addAttribute("isAlive", true);
		model.addAttribute("isThirsty", false);
		

		ArrayList<String> rides = new ArrayList<>();
		rides.add("Space Mountain");
		rides.add("Roller Coaster");
		rides.add("Silver Bullets");
		model.addAttribute("jspRides", rides);
		
		for(String eachRide: rides) {
			System.out.println(eachRide);
		}
		
		
		return "jstl.jsp";
	}
	
	
}
