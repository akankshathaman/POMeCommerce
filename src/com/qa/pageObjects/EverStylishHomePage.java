package com.qa.pageObjects;

import com.qa.Utility.UtilityCls;

public class EverStylishHomePage extends UtilityCls{
	public void clothingLink() {
		if(isDisplayedMethod("xpath", "//a[@href='https://everstylish.com/clothing.html']")) {
			clickMethod("xpath", "//a[@href='https://everstylish.com/clothing.html']");
		}
	}
}
