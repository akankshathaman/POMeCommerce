package com.qa.pageObjects;

import com.qa.Utility.UtilityCls;

public class HeaderClass extends UtilityCls{
	public void search(String query) {
		sendData("id", "search_query_top", query);
		submitMethod("id", "search_query_top");
	}
	
	public SignInClass clickSignIn() {
		clickMethod("partialLinkText", "Sign in");
		return new SignInClass();
	}
	public void homeIcon() {
		clickMethod("cssSelector", "img[alt='My Store']");
	}
}
