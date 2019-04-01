package com.qa.pageObjects;

import com.qa.Utility.UtilityCls;

public class EverStylishClothingPage extends UtilityCls{
	public void ascSort() {
		selectByValue("id", "sorter", "price");
	}
	public void filterSizeM() throws InterruptedException {
		Thread.sleep(3000);
		clickMethod("xpath", "//a[@class='title']");
		clickMethod("xpath", "//a[contains(@href, '168')]");
	}
}
