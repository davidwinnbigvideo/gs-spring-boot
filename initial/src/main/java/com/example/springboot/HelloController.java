package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Potatoes are the best!";
	}

	@GetMapping("/peanutButter")
	public String peanutButter() {
		return "Peanut butter is Nasty.";
	}

}
