package com.qa.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class UtilityCls {
	public static WebDriver driver;
	public static Properties prop;
	public SoftAssert sa= new SoftAssert();
	
	public void launchBrowser(String browserName, String browserDriver) {
		String driverPath= System.getProperty("user.dir")+"\\src\\"+browserDriver;

		if(browserName.equalsIgnoreCase("chrome")) {			
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", driverPath);
			driver= new FirefoxDriver();
		}
	}

	public void launchApp(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	public By locator(String locName, String locValue) {
		By byObj=null;
		switch(locName) {
		case "id":
			byObj=By.id(locValue);
			break;
		case "name":
			byObj=By.name(locValue);
			break;
		case "xpath":
			byObj=By.xpath(locValue);
			break;
		case "className":
			byObj=By.className(locValue);
			break;
		case "linkText":
			byObj=By.linkText(locValue);
			break;
		case "partialLinkText":
			byObj=By.partialLinkText(locValue);
			break;
		case "cssSelector":
			byObj=By.cssSelector(locValue);
			break;
		case "tagName":
			byObj=By.tagName(locValue);
			break;	
		}
		return byObj;
	}

	public void sendData(String locName, String locValue, String testData) {
		driver.findElement(locator(locName, locValue)).sendKeys(testData);
	}

	public void clickMethod(String locName, String locValue) {
		System.out.println(driver);
		driver.findElement(locator(locName, locValue)).click();
	}
	
	public void clickMethod(String locName, String locValue, int index) {
		driver.findElements(locator(locName, locValue)).get(index).click();
	}

	public boolean isDisplayedMethod(String locName, String locValue) {
		boolean isDisplay=driver.findElement(locator(locName, locValue)).isDisplayed();
		return isDisplay;
	}
	
	public int getSize(String locName, String locValue) {
		int size= driver.findElements(locator(locName, locValue)).size();
		return size;
	}

	public void browserBack() {
		driver.navigate().back();
	}

	public void browserForward() {
		driver.navigate().forward();
	}

	public String getUrlMethod() {
		return driver.getCurrentUrl();
	}

	public String getTitleMethod() {
		return driver.getTitle();
	}

	public void submitMethod(String locName, String locValue) {
		driver.findElement(locator(locName, locValue)).submit();
	}
	
	public String getTextMethod(String locName, String locValue) {
		String text=driver.findElement(locator(locName, locValue)).getText();
		return text;
	}
	public String getTextMethod(String locName, String locValue, int index) {
		String text=driver.findElements(locator(locName, locValue)).get(index).getText();
		return text;
	}

	
	//drop down methods using Select Class
	
	//select by visible text
	public void selectByText(String locName, String locValue, String visibleText) {
		Select dropDown=new Select(driver.findElement(locator(locName, locValue)));
		dropDown.deselectByVisibleText(visibleText);
	}
	
	//select by value
	public void selectByValue(String locName, String locValue, String valueText) {
		Select dropDown= new Select(driver.findElement(locator(locName, locValue)));
		dropDown.selectByValue(valueText);
	}
	
	//select by index
	public void selectByIndex(String locName, String locValue, int index) {
		Select dropDown= new Select(driver.findElement(locator(locName, locValue)));
		dropDown.selectByIndex(index);
	}
	

	public static void main(String[] args) throws IOException {
		UtilityCls obj= new UtilityCls();
		obj.launchBrowser("chrome", "Browsers\\chromedriver.exe");
		obj.launchApp("https://www.facebook.com/");
		obj.sendData("id", "email", "abcde");
		obj.sendData("name", "pass", "abcde");
		if(obj.isDisplayedMethod("xpath", "//input[@value='Log In']")) {
			System.out.println("Login button is available");
			obj.clickMethod("xpath", "//input[@value='Log In']");
		}
		System.out.println(obj.getUrlMethod());
		System.out.println(obj.getTitleMethod());
		obj.browserBack();


	}

}
