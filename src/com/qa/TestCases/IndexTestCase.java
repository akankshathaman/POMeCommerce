package com.qa.TestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pageObjects.DressesPage;
import com.qa.pageObjects.HeaderClass;
import com.qa.pageObjects.IndexPage;
import com.qa.pageObjects.SignInClass;

public class IndexTestCase extends IndexPage {
	@Parameters("browser")
	@BeforeTest(groups="launch")
	//optional
	public void launchSite(@Optional("chrome") String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			launchBrowser("chrome", "Browsers\\chromedriver.exe");
		} else if (browserName.equalsIgnoreCase("firefox")) {
			launchBrowser("firefox", "Browsers\\geckodriver.exe");
		}
		launchApp("http://automationpractice.com/index.php");
	}


	@Test public void checkTitle() {
		try	{ 
			sa.assertEquals(actualTitle(),"My Store"); 
		} 
		catch(StackOverflowError e) {
			e.printStackTrace();
		}

	}

	@Test(groups="header")
	public void search() throws InterruptedException {
		HeaderClass obj = new HeaderClass();
		obj.search("white");
		Thread.sleep(2000);
	}


	@Test(enabled = false)
	public void tShirts() {
		selectTshirts();
	}

	/*
	 * @Test public void sortDresses(){ SignInClass signObj = obj.clickSignIn();
	 * signObj.signIn("abc@gmail.com", "abc"); }
	 */



}
