package com.amdocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Employee;
import com.amdocs.repo.EmpRepo;


public interface EmpService {
	
   public List<Employee> getAllEmployee();
	
	public Employee getEmployee(long employeeId);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(long parseLong);
//	@Autowired
//	private EmpRepo repo;
//	
//	public List<Employee> getAllEmployee(){
//		
//		return this.repo.findAll();
//		
//	}
//	
//	public Employee addEmployee(Employee employee) {
//		
//		repo.save(employee);
//		return employee;
//	}

}
