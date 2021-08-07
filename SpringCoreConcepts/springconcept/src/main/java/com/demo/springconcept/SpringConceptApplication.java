/**
 * UC3 : Using Employee Bean and Department Bean, demonstrate Dependency Injection
 * 			Note – EmployeeBean and DepartBean are both Component as identified by Annotation and their
 * 				   corresponding Objects retrieved using Application Context
 *
 * @author : SAYANI KOLEY
 * @since : 07.08.2021
 */

package com.demo.springconcept;

import com.demo.springconcept.component.DemoBean;
import com.demo.springconcept.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConceptApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringConceptApplication.class);

	public static void main(String[] args) {

		/**
		 * Purpose : Printing the logging message based on the pattern provided in logback.xml
		 			 Since logger.debug is mentioned, so it will display the logging message from and above
		 			 the DEBUG level.
		 */

		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptApplication.class, args);
		logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
		logger.debug("\n*** Example Using @Autowire annotation on property ***");

		/**
		 * Purpose : Creating the EmployeeBean object dynamically
		  			 Setting the employee id and employee name
		  			 Displaying the EmployeeBean details using the showEmployeeDetails().
		 */

		EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework");
		employeeBean.showEmployeeDetails();
	}

}
