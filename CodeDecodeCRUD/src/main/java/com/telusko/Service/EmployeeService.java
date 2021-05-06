package com.telusko.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.CustomException.BusinessException;
import com.telusko.Model.Employee;
import com.telusko.Repository.EmployeeCrudRepo;
import com.telusko.ServiceImpl.EmployeeServiceImpl;

@Service
public class EmployeeService implements EmployeeServiceImpl{

	@Autowired
	private EmployeeCrudRepo empCrudRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		//Never Put a try in Validations ...It is big blunder 
		
		if(employee.getName().isEmpty()|| employee.getName().length()==0) {
				throw new BusinessException("601", "Please send a proper name, its blank");
			}
		try {
			Employee savedEmployee = empCrudRepo.save(employee);
			return savedEmployee;
		}
		catch (IllegalArgumentException e) {
			throw new BusinessException("602","Given Employee is blank"+e.getMessage());
		}
		catch (Exception e) {
			throw new BusinessException("603","Something went wrong in service layer while saving the employee"+e.getMessage());
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> empList=null;
		try {
			empList= empCrudRepo.findAll();
		}
		catch (Exception e) {
			throw new BusinessException("605","Something went wrong in service layer while fetching all employees"+e.getMessage());
		}
		if(empList.isEmpty())
			throw new BusinessException("604", "List is completely empty, we have nothing to return");
		return empList;		
	}
		
	

	@Override
	public Employee getEmployeeById(long empid) {
		try {
			return empCrudRepo.findById(empid).get();	
		}
		catch (IllegalArgumentException e) {
			throw new BusinessException("606","Given employee is null,pls send some id"+e.getMessage());
		}
		catch (java.util.NoSuchElementException e) {
			throw new BusinessException("607","Given employee id does not exists"+e.getMessage());
		}
		
	}

	@Override
	public void deleteEmployeeById(long empid) {
		try {
			empCrudRepo.deleteById(empid);	
		}
		catch (IllegalArgumentException e) {
			throw new BusinessException("608","Given employee is null,pls send some id"+e.getMessage());
		}
	}
}
