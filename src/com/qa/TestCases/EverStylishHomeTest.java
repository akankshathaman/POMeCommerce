package com.qa.TestCases;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.pageObjects.EverStylishHomePage;

public class EverStylishHomeTest extends EverStylishHomePage{
	@BeforeSuite
	public void setUp() {
		launchBrowser("chrome", "Browsers\\chromedriver.exe");
		launchApp("https://everstylish.com/");
	}
	@Test
	public void testClothingLink() {
		clothingLink();
	}

}
