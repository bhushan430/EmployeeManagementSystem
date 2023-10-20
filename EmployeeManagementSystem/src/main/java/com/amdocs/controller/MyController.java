package com.amdocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.entity.Employee;
import com.amdocs.service.EmpService;

@RestController
public class MyController {

	@Autowired
	private EmpService em;
	
	@GetMapping("/api")
	private String home() {
		// TODO Auto-generated method stub
		return "Welcome to Emp";
	}
	
	@GetMapping("/api/employees")
	private List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return this.em.getAllEmployee();
	}
	
	@GetMapping("/api/employees/{empId}")
	private Employee getEmp(@PathVariable String empId) {
		// TODO Auto-generated method stub
      return this.em.getEmployee(Long.parseLong(empId));
		
	}
	
	@PostMapping("/api/employees")
	private Employee addEmp(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
        return this.em.addEmployee(employee);
	}
	
	@PutMapping("/api/employees")
	private Employee updateEmp(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
       return this.em.updateEmployee(employee);
	}
	
	@DeleteMapping("/api/employees/{empId}")
	private ResponseEntity<HttpStatus> deleteEmp(@PathVariable String empId) {
		// TODO Auto-generated method stub
         try {
        	 this.em.deleteEmployee(Long.parseLong(empId));
      	   return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
}
