/**
 * UC2 : Create a Helloworld Spring App to display “Hello from BridgeLabz” in a Web Page 
 			- Use MVC Controller to invoke a View i.e. HTML	when request is received and also pass Model to be displayed.
			- Use Thymeleaf to display the Model
 * 
 * @author SAYANI KOLEY
 * @since 06.08.2021
 */

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
	
	/**
	 * Purpose : @GetMapping is the annotation for mapping HTTP GET requests onto specific handlermethods. 
	 			 When we provide the url as localhost:8080/web, we basically invoke the hello.html page to provide the output message
	 * @return
	 */
	
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}
	
	/**
	 * Purpose : @GetMapping is the annotation for mapping HTTP GET requests onto specific handlermethods. 
	 			 When we provide the url as localhost:8080/web/message, we basically create a model and add an attribute to it to pass a custom message.
	 			 Finally we invoke the message.html page to provide the custom output message
	 * @return
	 */
	
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message", "This is a custom message");
		return "message";
	}
}
