package com.telusko.main.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.telusko.main.Model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer>{
	
	public Student findAllByUsernameAndPassword(String username,String password);
	public Student findAllBysid(int sid);

}
