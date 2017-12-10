package com.show.demo.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

//	private final EmployeeRepository repository;
//
//	@Autowired
//	public DatabaseLoader(EmployeeRepository repository) {
//		this.repository = repository;
//	}
//
//	@Override
//	public void run(String... strings) throws Exception {
//		this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
//	}
}