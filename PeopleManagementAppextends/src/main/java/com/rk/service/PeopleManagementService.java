package com.rk.service;

import java.util.List;

import com.rk.entity.Person;

public interface PeopleManagementService {

public Person save(Person person);
	
	public Person getPersonById(int id);
	
	public Person UpdatefirstNamePersonById(Person person , int id);
	
	public String deleteBYId(int id);
	
	public Iterable<Person> findAllPerson();

	public List<Person> getPersonInfoByFirstName(String string);

	public List<Person> getPersonByFirstNameAndEmail(String string, String string2);
	
}
