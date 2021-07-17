package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Value("${test.string: default}")
	private String testString;
	
	@GetMapping("/getProps")
	public String getConfigProperties() {
		return testString;
	}
}
