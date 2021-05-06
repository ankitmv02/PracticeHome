package com.telusko.ServiceImpl;

import java.util.List;

import com.telusko.Model.Employee;

public interface EmployeeServiceImpl {

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(long empid);

	public void deleteEmployeeById(long empid);

}
