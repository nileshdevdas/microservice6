package com.siemens.mymicroservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@RequestMapping(path = "hello", method = RequestMethod.GET)
	public String getMessage() {

		return "Hello World From MicroService 12323";
	}
}
