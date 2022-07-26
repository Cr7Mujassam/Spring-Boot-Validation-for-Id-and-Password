package com.in28minutes.springboot.web.springbootfirstwebapplication.loginService;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean Validation(String userName,String Password) {
		System.out.println(userName + " " + Password);
		return userName.equalsIgnoreCase("M") && Password.equalsIgnoreCase("M");
		
		
	}

}
