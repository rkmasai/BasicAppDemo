package com.rk.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.entity.Person;
import com.rk.repo.PeopleManagementRepo;

@Service
public class PeopleManagementServiceImpl implements PeopleManagementService {

	
	@Autowired
	private PeopleManagementRepo peopleMangementRepo ;
	
	@Override
	public Person save(Person person) {
		
		return peopleMangementRepo.save(person);
	}

	@Override
	public Person getPersonById(int id) {
		
		
			Optional<Person> person = peopleMangementRepo.findById(id);
		
		
		return person.get();
	}

	@Override
	public Person UpdatefirstNamePersonById(Person person, int id) {
		
		Optional<Person> people = peopleMangementRepo.findById(id);
		
		people.get().setFirstName(person.getFirstName());
		
		
		
		return peopleMangementRepo.save(people.get());
	}

	@Override
	public String deleteBYId(int id) {
		String result = "No Record Found";
		
		try {
			Optional<Person> person = peopleMangementRepo.findById(id);
			
			peopleMangementRepo.delete(person.get());
			
			result ="Person Deleted SucessFully";
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

	@Override
	public Iterable<Person> findAllPerson() {

		return peopleMangementRepo.findAll();
	}

	@Override
	public List<Person> getPersonInfoByFirstName(String firstName) {
		
		
		return peopleMangementRepo.findByFirstName(firstName);
	}

	@Override
	public List<Person> getPersonByFirstNameAndEmail(String string, String string2) {
		// TODO Auto-generated method stub
		return peopleMangementRepo.findByFirstNameAndEmail(string, string2);
	}
	
}
