package com.qa.pageObjects;

import com.qa.Utility.UtilityCls;

public class SignInClass extends UtilityCls {
	public void signIn(String email, String pswd) {
		sendData("id", "email", email);
		sendData("id", "passwd", pswd);
		clickMethod("id", "SubmitLogin");
	}

}
