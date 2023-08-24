package com.rk.repo;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rk.entity.Person;

@Repository 
public interface PeopleManagementRepo extends CrudRepository<Person, Integer> {

	List<Person> findByFirstName(String firstName);	
	
	List<Person> findByFirstNameAndEmail(String firstName , String eamil);
	
	
}
