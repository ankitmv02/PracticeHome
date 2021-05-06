package com.telusko.main.Service;

import org.springframework.stereotype.Service;

import com.telusko.main.Model.Student;

@Service
public interface StudentService {

	public void saveData(Student s);
	public void deleteData(Student s);
	public Iterable<Student> getAllData();
	public Student editData(int sid);
	public Student loginAuth(String username, String password);
}
