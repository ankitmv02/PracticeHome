package com.telusko.main.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.main.Model.Student;
import com.telusko.main.Repository.StudentRepo;
import com.telusko.main.Service.StudentService;

@Service
public class StudentServiceImplementation implements StudentService{

	@Autowired
	StudentRepo sr;
	
	@Override
	public void saveData(Student s) {
		sr.save(s);
	}

	@Override
	public void deleteData(Student s) {
		sr.delete(s);
	}

	@Override
	public Iterable<Student> getAllData() {
		return sr.findAll();
	}

	@Override
	public Student editData(int sid) {
		
		return sr.findAllBysid(sid);
	}

	@Override
	public Student loginAuth(String username, String password) {
		
		return sr.findAllByUsernameAndPassword(username, password);
	}

}
