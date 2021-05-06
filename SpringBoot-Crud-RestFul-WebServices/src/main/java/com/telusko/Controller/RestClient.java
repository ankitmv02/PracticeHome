package com.telusko.Controller;

import org.springframework.web.client.RestTemplate;

public class RestClient {

	private static final String GET_ALL_USERS_API = "http://localhost:8088/api/users";
	private static final String GET_User_By_Id_API = "http://localhost:8088/api/users/{id}";
	private static final String CREATE_USER_API = "http://localhost:8088/api/users";
	private static final String Update_User_By_Id_API = "http://localhost:8088/api/users/{id}";
	private static final String Delete_User_By_Id_API = "http://localhost:8088/api/users/{id}";
	
	RestTemplate restTemplate =new RestTemplate();
	
	
	public static void main(String[] args) {
		
	}
	
	private static void callGetAllUsersAPI() {
		
	}
}
