package com.shopping.frontcontrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloShoppingController {
	
	@RequestMapping(value = "/say-hello", method = RequestMethod.GET, produces = "text/plain")
	public String hello() {
		return "Hello Yaser!";
	}
}
