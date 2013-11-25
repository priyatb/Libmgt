package com.library.processor;

import com.library.viewmodel.LoginModel;

public class LoginRequestProcessor {

	public boolean processRquest(LoginModel loginModel) {
		if(loginModel.getUserName().equalsIgnoreCase("test") && loginModel.getPassword().equalsIgnoreCase("password")){
			return true;
		}else{
			return false;
		}
	}
	
}
