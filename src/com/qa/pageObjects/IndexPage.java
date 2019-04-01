package com.qa.pageObjects;

import java.io.IOException;

import com.qa.Utility.UtilityCls;

public class IndexPage extends UtilityCls{

	
	
	public void selectTshirts() {
		clickMethod("xpath", "//a[@title='T-shirts']",1);
	}
	
	public DressesPage selectDresses() {
		clickMethod("xpath", "//a[@title='Dresses']", 1);
		return new DressesPage();
	}
	public void clickContactUs() {
		clickMethod("xpath", "//a[@title='Contact Us']");
	}
	
	public String actualTitle() {
		try {
		String actTitle= getTitleMethod();
		}
		catch(StackOverflowError e) {
			System.out.println("error in index page object");
			e.printStackTrace();
		}
		return actualTitle();
	}

}
