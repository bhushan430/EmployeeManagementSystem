package com.amdocs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.entity.Employee;
import com.amdocs.repo.EmpRepo;

@Service
public class EmpServiceIMPL implements EmpService {
	@Autowired
	private EmpRepo repo;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee getEmployee(long employeeId) {
		// TODO Auto-generated method stub
		return repo.findById(employeeId).get();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(long parseLong) {
		// TODO Auto-generated method stub
		Employee entity=repo.getOne(parseLong);
		repo.delete(entity);
		
	}
	
//	@Override
//	public List<Employee> getAllEmployee(){
//		
//		return this.repo.findAll();
//		
//	}
//	
//	@Override
//	public Employee getEmployee(long courseId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
//	@Override
//	public Employee addEmployee(Employee employee) {
//		
//		repo.save(employee);
//		return employee;
//	}
	
	
}
