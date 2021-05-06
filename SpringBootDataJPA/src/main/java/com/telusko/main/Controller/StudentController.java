package com.telusko.main.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.main.Model.Student;
import com.telusko.main.Service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService ss;
	
	@RequestMapping("/")
	public String preLoginCheck() {
		return "login";
	}
	
	@RequestMapping("/reg")
	public String preRegistration() {
		return "register";
	}
	
	@RequestMapping("/register")
	public String registration(@ModelAttribute("stu") Student s) {
		ss.saveData(s);
		return "login";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam("username") String username,
						@RequestParam("password") String password, Model m) {
		Student stu=ss.loginAuth(username, password);
		if(stu!=null) {
			Iterable<Student> stulist=ss.getAllData();
			m.addAttribute("data",stulist);
			return "success";
		}
		else {
			return "error";
		}
	}
	
	@RequestMapping("/edit")
	public String editData(@RequestParam("sid") int sid, Model m){
		Student stu=ss.editData(sid);
		m.addAttribute("data", stu);
		return "edit";
	}
	
	@RequestMapping("/update")
	public String updateData(@ModelAttribute("stu") Student s, Model m){
		ss.saveData(s);
		Iterable<Student> emplist=ss.getAllData();
		m.addAttribute("data", emplist);
		return "success";
	}
	
	@RequestMapping("/delete")
	public String deleteData(@ModelAttribute("stu") Student s, Model m){
		ss.deleteData(s);
		Iterable<Student> stulist=ss.getAllData();
		m.addAttribute("data", stulist);
		return "success";
	}
	@RequestMapping("/add")
	public String addData() {
		return "register";
	}
	
	@RequestMapping("*")
	public String errorPage(){
		return "error";
	}
}
