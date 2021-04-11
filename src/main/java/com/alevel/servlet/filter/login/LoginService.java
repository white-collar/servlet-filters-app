package com.alevel.servlet.filter.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("alevel") && password.equals("com"))
			return true;

		return false;
	}

}
