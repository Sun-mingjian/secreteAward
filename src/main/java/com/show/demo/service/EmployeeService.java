package com.show.demo.service;

import java.util.List;

import com.show.demo.model.Employee;

public interface EmployeeService {
	public List<Employee> findAllEmployees();
	public Employee createNewEmployee(Employee employee);
	public Employee getOneEmployee(Long id);
	public Employee updateEmployee(Long id,Employee employee);
	public Employee deleteEmployee(Long id);
}
