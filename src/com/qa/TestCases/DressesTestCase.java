package com.qa.TestCases;

import org.testng.annotations.Test;

import com.qa.pageObjects.DressesPage;
import com.qa.pageObjects.SignInClass;

public class DressesTestCase extends DressesPage{
	@Test(groups="Dresses")
	public void checkAscSort() {
		sortDresses("price:asc");
	}

}
