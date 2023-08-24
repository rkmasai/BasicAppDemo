package com.rk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rk.entity.Person;
import com.rk.service.PeopleManagementService;

@SpringBootApplication
public class PeopleManagementAppApplication implements CommandLineRunner {

	@Autowired 
	private PeopleManagementService peopleManagementService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		getPersonInfoByFirstName();
		
		getPersonByFirstNameAndEmail();
		
	}

	private void getPersonByFirstNameAndEmail() {
		
		List<Person> personList = peopleManagementService.getPersonByFirstNameAndEmail("vijay","vijay@gmail.com");
		
		if(personList.isEmpty()) {
			System.out.println("Not record found");
		}
		else {
		
		
		
		personList.forEach(System.out::println);
	}
		
	}

	private void getPersonInfoByFirstName() {
		
		List<Person> personList = peopleManagementService.getPersonInfoByFirstName("vinay");
		
		if(personList.isEmpty()) {
			System.out.println("Not record found");
		}
		else {
		
		
		
		personList.forEach(System.out::println);
	}
	}
	
}
