package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.pageObjects.ContactUsClass;
import com.qa.pageObjects.HeaderClass;
import com.qa.pageObjects.IndexPage;
import com.qa.pageObjects.SignInClass;

public class ContactUsTest extends ContactUsClass{
	HeaderClass headerObj= new HeaderClass();
	SignInClass sObj;
	@Test(groups="contact")
	public void checkContactUs() {
		IndexPage conObj= new IndexPage();
		conObj.clickContactUs();
		sendMessage();
	}
	
	@Test(groups="header")
	public void goToHome() {
		headerObj.homeIcon();
	}
	
	@Test(groups="header")
	public void checkSignInLink() {
		sObj=headerObj.clickSignIn();
	}
	
	
	@Test(dependsOnMethods="checkSignInLink",groups="signIn")
	public void checkSignInFunc() {
		sObj.signIn("abc", "123");
	}
	
	
}
