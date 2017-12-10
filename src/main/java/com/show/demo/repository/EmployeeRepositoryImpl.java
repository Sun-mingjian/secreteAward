package com.show.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.show.demo.model.Employee;

@Transactional
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

	@PersistenceContext
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
