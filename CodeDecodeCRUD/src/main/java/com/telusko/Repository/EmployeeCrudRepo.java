package com.telusko.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.Model.Employee;

@Repository
public interface EmployeeCrudRepo extends JpaRepository<Employee, Long>{

}
