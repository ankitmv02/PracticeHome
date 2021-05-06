package com.telusko.dao;

import org.springframework.data.repository.CrudRepository;

import com.telusko.model.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>
{

}
