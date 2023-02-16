package com.techStaxAssesment1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhook")
public class Controller {
	
	@GetMapping("/git/pull")
	public String pull() {
		return "Pull from Github";
	}

	@GetMapping("/git/push")
	public String push() {
		return "Push to Github";
	}

	@GetMapping("/git/merge")
	public String merge() {
		return "Merge from Github";
	}
}
