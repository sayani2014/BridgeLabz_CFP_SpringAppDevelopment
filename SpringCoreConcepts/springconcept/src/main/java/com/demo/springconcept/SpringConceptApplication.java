/**
 * UC1 : Create a Project to learn Spring Concepts
 *
 * @author : SAYANI KOLEY
 * @since : 06.08.2021
 */

package com.demo.springconcept;

import com.demo.springconcept.component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptApplication {

	public static void main(String[] args) {

		/**
		 * Purpose : Display the "Welcome to Spring Concept Demo" message
		 */

		System.out.println("Welcome to Spring Concept Demo");

		/**
		 * Purpose : To determine the Spring Framework when an application is launched
		 * 			 When the application is launched, first thing which gets determined is the @SpringBootApplication.
		 * 			 This results in calling the run().
		 * 			 As a result the @EnableAutoConfiguration, @Configuration, @ComponentScan starts running parallely
		 * 			 and it prepares the IOC Container.
		 * 			 The IOC Container identifies, instantiates, configures and assembles the object.
		 * 			 Finally it is returned back to the ApplicationContext interface
		 */

		ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);
		DemoBean demoBean = context.getBean(DemoBean.class);
		System.out.println("Demo Bean = "+demoBean.toString());
	}

}
