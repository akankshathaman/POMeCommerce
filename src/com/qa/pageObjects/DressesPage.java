package com.qa.pageObjects;

import java.io.IOException;

import com.qa.Utility.UtilityCls;

public class DressesPage extends UtilityCls{
	public void sortDresses(String value) {
		selectByValue("id", "selectProductSort", value);
	}
	
	
}
