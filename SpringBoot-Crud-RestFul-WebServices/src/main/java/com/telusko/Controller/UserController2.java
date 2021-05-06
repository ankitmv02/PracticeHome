package com.telusko.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.telusko.Model.User;

//@RestController
public class UserController2 {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/users")
	List<User> getAllUsers(){
		
		String url="http://localhost:8088/user/users";
		List allUsers=restTemplate.getForObject(url, List.class);
		return allUsers;
	}
}
