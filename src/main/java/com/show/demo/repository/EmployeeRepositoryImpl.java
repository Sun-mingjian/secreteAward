package com.show.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.show.demo.model.Employee;

import jnr.ffi.types.sa_family_t;

@Transactional
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

	@Autowired
	EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAll() {
		String hql = "FROM employees as emp ORDER BY emp.id";
		return (List<Employee>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Employee saveAndFlush(Employee employee) {
		 entityManager.persist(employee);
		 return employee;
	}

	@Override
	public Employee findOne(Long id) {
		return entityManager.find(Employee.class, id);

	}

	@Override
	public Employee deleteEmployee(Employee existingEmployee) {
		entityManager.remove(existingEmployee);
		return existingEmployee;

	}
	
	

}
