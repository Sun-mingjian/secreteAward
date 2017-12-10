package com.show.demo.repository;

import java.util.List;

import com.show.demo.model.Employee;

public interface EmployeeRepository{
	public List<Employee> findAll();
	public Employee saveAndFlush(Employee employee);
	public Employee findOne(Long id);
	public Employee deleteEmployee(Employee existingEmployee);

}
