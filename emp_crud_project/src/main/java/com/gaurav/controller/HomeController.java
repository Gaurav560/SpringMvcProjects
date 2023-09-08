package com.gaurav.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//by default RequestMapping follows get method
	@RequestMapping("/home")
	public String home() {
		
		return "";
	}
}
