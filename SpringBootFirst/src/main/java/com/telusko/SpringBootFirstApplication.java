package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cac= SpringApplication.run(SpringBootFirstApplication.class, args);
		System.out.println("Main Class");
		
		Student s=cac.getBean(Student.class);
		s.show();
	}

}
