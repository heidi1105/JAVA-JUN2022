package com.heidichen.firstspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {

	// rendering info to different routes (3 options)
	
	// option 1
	@RequestMapping("/option1")
	public String test1() {
		return "Testing option 1";
	}
	
	// option 2 - RequestMapping (default: get    method: post, put, delete)
	@RequestMapping(value="/option2", method=RequestMethod.GET)
	public String test2() {
		return "Testing option 2";
	}
	
	// option 3 - shortcut for get
	@GetMapping("/option3") // @PostMapping , @PutMapping, @DeleteMapping
	public String test3() {
		return "Testing option 3";
	}

	// ----- QUERY PARAMETERS (requestBody or search)-----
	// http://localhost:8080/api/search?q=whatever
	@RequestMapping("/search")
	public String query1(@RequestParam("q") String searchQuery) {
		return "You searched for " + searchQuery;	
	}
	
	// http://localhost:8080/api/search2?q=whatever&count=10
	@RequestMapping("/search2")
	public String query2(@RequestParam("q") String searchQuery, @RequestParam(value="count", required=false)Integer counting ) {
//		String s = "";
//		for(int i=0; i<counting; i++) {
//			s += searchQuery;
//		}
		return "You searched for " + searchQuery +" for " + counting + " times";	
	}
	
	
	// ----- PATH VARIABLES -----
	// http://localhost:8080/api/pets/pepper/14
	// name = pepper, age = 14
	@RequestMapping("/pets/{pathName}/{pathAge}")
	public String path1(@PathVariable("pathName")String name, @PathVariable("pathAge")Integer age ) {	
		return name + " is " + age + " years old";
	}
	
	
	
	
}

















