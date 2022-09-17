package com.simplilearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.simplilearn.model.Employee;

public class App {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");

		Employee e1 = (Employee) appContext.getBean("e1");
		System.out.println(e1.getFirstName() + " " + e1.getLastName() + " " + e1.getAddress().getCity() + " "
				+ e1.getAddress().getState() + " " + e1.getAddress().getCountry());
	}

}
