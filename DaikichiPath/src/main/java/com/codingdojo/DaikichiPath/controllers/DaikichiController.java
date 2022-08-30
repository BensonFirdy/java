package com.codingdojo.DaikichiPath.controllers;

import org.springframewrok.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/diakichi")
public class DaikichiController {

	@RequestMapping("")
	public String daikichi() {
		return "Welcome";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{location}")
	public String dojo(@PathVariable("location") String location) {
		if(location.equals("dojo")) {
			return "The Dojo is awesome!";
		}
		return "";
	}	
	

	}
	
}
