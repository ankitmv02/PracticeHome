package com.telusko.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.dao.StudentRepo;
import com.telusko.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo sr;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student stu) {
		sr.save(stu);
		return "home";
	}
	
	@RequestMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam int sid) {
		
		ModelAndView mv=new ModelAndView("showStudent");
		Student stu=sr.findById(sid).orElse(new Student());
		mv.addObject(stu);
		System.out.println("Stu added Successfully");
		return mv;
	}
	
	
}
