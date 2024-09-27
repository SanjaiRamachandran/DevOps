package com.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsController {
	
	@GetMapping(value="/get")
	public String get() {
		return "Hello Chennai";
	}

}
