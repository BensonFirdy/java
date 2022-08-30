package com.codingdojo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RootController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/omikuji") 
	public String form() {
		
		return "omikuji.jsp";
	}
	

	@RequestMapping(value="/omikuji/process", method=RequestMethod.POST)
	public String process(
			HttpSession session,
			@RequestParam(value="number") String number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="animal") String animal,
			@RequestParam(value="description") String description
			) {
		 
		session.setAttribute("number", number);
		session.setAttribute("city", city); 
		session.setAttribute("person", person); 
		session.setAttribute("hobby", hobby); 
		session.setAttribute("animal", animal); 
		session.setAttribute("description", description); 
		
		
		return "redirect:/omikuji/show"; 
	}
	
	@RequestMapping("/omikuji/show") 
	public String show(
			Model model,
			HttpSession session) {
		String number = (String) session.getAttribute("number");
		String city = (String) session.getAttribute("city");
		String person = (String) session.getAttribute("person");
		String hobby = (String) session.getAttribute("hobby");
		String animal = (String) session.getAttribute("animal");
		String description = (String) session.getAttribute("description");
		
		model.addAttribute("number", number);
		model.addAttribute("city", city);
		model.addAttribute("person", person);
		model.addAttribute("hobby", hobby);
		model.addAttribute("animal", animal);
		model.addAttribute("description", description);
		
		System.out.println("In " + number + "years, you will live in " + city + "with "+  person +"as your partner, selling/doing " + hobby + "for living. "+ "The next time you see a " + animal + " ,you will have good luck." + "Also, " +description);
		

		return "show.jsp";
		
	}
	
}
