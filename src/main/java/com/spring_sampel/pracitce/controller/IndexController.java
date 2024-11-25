package com.spring_sampel.pracitce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping("/login")
	public String showLoginForm() {

		return "login";
	}

}
