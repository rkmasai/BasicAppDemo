package com.rk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.entity.Person;
import com.rk.service.PeopleManagementService;



@RestController
@RequestMapping("/peoples")
public class PeopleManagementController {
	
	@Autowired
	private PeopleManagementService peopleManagementService;
	
	@PostMapping("/savePerson")
	public Person savePersonController(@RequestBody Person person) {
		
		
		return peopleManagementService.save(person);
		
	}
	
	@GetMapping("/person/{person_id}")
	public Person getPersonById(@PathVariable ("person_id") int person_id) {
		
		return peopleManagementService.getPersonById(person_id);
		
		
	}
	
	@PutMapping("/updateperson/{person_id}")
	public Person updatePersonById(@RequestBody Person Person , @PathVariable ("person_id") int id) {
		
		return peopleManagementService.UpdatefirstNamePersonById(Person, id);
	}
	
	@GetMapping("/persons")
	public Iterable<Person> getAllPersons(){
		
		return peopleManagementService.findAllPerson();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteByIdController(@PathVariable int id) {
		return peopleManagementService.deleteBYId(id);
	}
	
	
	
	

}
