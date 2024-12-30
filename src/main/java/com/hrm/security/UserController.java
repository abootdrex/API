package com.hrm.security;

import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
 

@Controller
public class UserController {
	 

	@GetMapping("/")
	public String newe(  Model model) {
		return "newe";
	}

	@GetMapping("/contact")
	public String contact( Model model) {
	 
		 
		return "contact";
	}

	@GetMapping("/out")
	public String showCheckout(  Model model) {
	 
 
		return "out";
	}

	@GetMapping("/signup")
	public String showSignupForm(Model model) {
		model.addAttribute("user", new User());
		return "signup";
	}

	@PostMapping("/signup")
	public String signup(@ModelAttribute("user") User user, Model model) {
	 
		 

		return "redirect:/login";
	}

	@GetMapping("/login")
	public String showLoginForm() {

		return "login";
	}

	@GetMapping("/cources")
	public String showPg() {

		return "cources";
	}
	@GetMapping("/aboutme")
	public String aboutme() {
		return "aboutme";		
	}
	
}
