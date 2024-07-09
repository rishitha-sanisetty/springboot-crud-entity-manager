package com.entitymanager.springboot_crud_entity_manager;

import com.entitymanager.springboot_crud_entity_manager.entity.Person;
import com.entitymanager.springboot_crud_entity_manager.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCrudEntityManagerApplication implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudEntityManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.update(new Person(2,"Rishitha", "rishi@gmail.com", "India"));
		personRepository.insert(new Person("Minnu", "minnu@gmail.com", "India"));
		personRepository.findById(1);
		personRepository.deleteById(1);
		personRepository.findAll();
	}
}
