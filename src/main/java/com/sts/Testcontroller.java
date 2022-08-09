package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Testcontroller {

	@RequestMapping("/")
	public String handleTest() {
		
		System.out.println("this is home page");
		return "test";
	}
	@RequestMapping("/contact")
	public String handleContact() {
		
		System.out.println("this is home page");
		return "contact";
	}

}
