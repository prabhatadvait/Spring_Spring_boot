package com.prabhat.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args); //Creates Container for us

		Dev obj  = context.getBean(Dev.class);  // injecting dependency using spring boot

//		Dev obj =new Dev();
		obj.build();
	}

}
