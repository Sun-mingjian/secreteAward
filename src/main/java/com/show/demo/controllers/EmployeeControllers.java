package com.show.demo.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.show.demo.model.Employee;
import com.show.demo.repository.EmployeeRepository;
import com.show.demo.service.EmployeeService;

@RestController
@RequestMapping("sun/")
public class EmployeeControllers {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="emp",method=RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return employeeService.findAllEmployees();
	}
	
	@RequestMapping(value="emp",method=RequestMethod.POST)
	public Employee createNewEmployee(@RequestBody Employee employee){
		return employeeService.createNewEmployee(employee);
	}
	
	@RequestMapping(value="emp/{id}",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable Long id){
		return employeeService.getOneEmployee(id);
	}
	
	@RequestMapping(value="emp/{id}",method=RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){
		 return employeeService.updateEmployee(id,employee);
	}
	
	@RequestMapping(value="emp/{id}",method=RequestMethod.DELETE)
	public Employee deleteEmployee(@PathVariable Long id){
		return employeeService.deleteEmployee(id);
	}
	
	

}
