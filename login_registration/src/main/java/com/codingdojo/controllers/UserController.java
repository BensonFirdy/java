package com.codingdojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.models.TempUser;
import com.codingdojo.models.User;

@Controller
@RequestMapping("/user")

public class UserController {
	@GetMapping("")
	public String login_register(Model model) {
		
		model.addAttribute("userRegister", new User());
		model.addAttribute("userLogin", new TempUser());
		return "login_register";
	}
	

}
