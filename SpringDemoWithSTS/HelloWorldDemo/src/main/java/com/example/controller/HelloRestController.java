/**
 * UC2 : Create a Helloworld Spring App to display “Hello from BridgeLabz” in REST Call 
 			- Use REST Controller to respond to the REST Request.
 * 
 * @author SAYANI KOLEY
 * @since 06.08.2021
 */

package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	/**
	 * Purpose : @RequestMapping is the annotation for mapping web requests onto methods in request-handling classes with flexible method signatures.
	 			 When we provide the url as localhost:8080/hello, we basically invoke the return message and output it.
	 			 
	 			 We can also use the command prompt to execute the output message.
	 			 Execution command : curl localhost:8080/hello -w "\n"
	 * @return
	 */
	
	@RequestMapping("/hello")
	public String index() {
		return "Hello from BridgeLabz";
	}
}
