package com.telusko.Controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.CustomException.BusinessException;
import com.telusko.CustomException.ControllerException;
import com.telusko.Model.Employee;
import com.telusko.Repository.EmployeeCrudRepo;
import com.telusko.ServiceImpl.EmployeeServiceImpl;

@RestController
@RequestMapping("/code")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empServiceInterface;
	
	@PostMapping("/save")
	public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
		//? because we have to return diff responseEntities
		try {
			Employee employeeSaved= empServiceInterface.addEmployee(employee);
			return new ResponseEntity<Employee>(employeeSaved,HttpStatus.CREATED);	
		}
		catch(BusinessException e) {
			ControllerException ce=new ControllerException(e.getErrorCode(),e.getErrorMessage()); 
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		catch(Exception e) {
			ControllerException ce=new ControllerException("611","Something  went Wrong in Controller"); 
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		
		List<Employee> listOfAllEmployees = empServiceInterface.getAllEmployees();
		return new ResponseEntity<List<Employee>>(listOfAllEmployees,HttpStatus.OK);
	}
	
	@GetMapping("/emp/{id}")
	public ResponseEntity<?> getEmployeeById(@PathVariable("id") long empid){
		try {
			Employee singleEmployee = empServiceInterface.getEmployeeById(empid);
			return new ResponseEntity<Employee>(singleEmployee,HttpStatus.OK);	
		}
		catch(BusinessException e) {
			ControllerException ce=new ControllerException(e.getErrorCode(),e.getErrorMessage()); 
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		catch(Exception e) {
			ControllerException ce=new ControllerException("612","Something  went Wrong in Controller"); 
			return new ResponseEntity<ControllerException>(ce,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteEmployeeById(@PathVariable("id") long empid){
		
		empServiceInterface.deleteEmployeeById(empid);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
		Employee employeeSaved= empServiceInterface.addEmployee(employee);
		return new ResponseEntity<Employee>(employeeSaved,HttpStatus.CREATED);
	}
	
}
