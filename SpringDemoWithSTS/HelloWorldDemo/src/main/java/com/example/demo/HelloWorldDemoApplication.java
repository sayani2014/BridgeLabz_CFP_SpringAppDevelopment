/**
 * UC1 : Create a Helloworld Spring App to display “Hello from BridgeLabz” using STS 
 * 
 * @author SAYANI KOLEY
 * @since 06.08.2021
 */

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.controller"})
public class HelloWorldDemoApplication {

	public static void main(String[] args) {
		
		/**
		 * Purpose : Print statement to display "Hello from BridgeLabz"
		 */
		
		System.out.println("Hello from BridgeLabz");
		SpringApplication.run(HelloWorldDemoApplication.class, args);
	}

}
