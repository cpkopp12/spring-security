package com.in28minutes.learnspringsecurity.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoResource {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "hello world v1";
	}
	
	
}
