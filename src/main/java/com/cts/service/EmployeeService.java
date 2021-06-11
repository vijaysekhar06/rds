package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.model.Employee;
import com.cts.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

public List<Employee>	getAllEmployee(){
		return employeeRepository.findAll();
	}

public String addEmployee(Employee employee)
{
	employeeRepository.save(employee);
	return "Employee added "+employee.getId()+" successfully";
}
}
