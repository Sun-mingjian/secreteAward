package com.show.demo.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.show.demo.model.Employee;
import com.show.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee createNewEmployee(Employee employee) {
		employeeRepository.saveAndFlush(employee);
		return employee;
	}

	@Override
	public Employee getOneEmployee(Long id) {
		return employeeRepository.findOne(id);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		 Employee existingEmployee = employeeRepository.findOne(id);
		 if(existingEmployee!=null){
			 BeanUtils.copyProperties(employee, existingEmployee);
			 employeeRepository.saveAndFlush(employee);
		 }
		 return employee;
	}

	@Override
	public Employee deleteEmployee(Long id) {
		 Employee existingEmployee = employeeRepository.findOne(id);
		 if(existingEmployee!=null){
			 employeeRepository.deleteEmployee(existingEmployee);
		 }
		 return existingEmployee;
	}

	
	
	

}
