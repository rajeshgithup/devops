package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Devopscontroller {
	@GetMapping("/get")
	public String get() {
		return "hi";
	}

}
