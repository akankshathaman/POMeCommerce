package com.qa.pageObjects;

import com.qa.Utility.UtilityCls;

public class ContactUsClass extends UtilityCls{
	
	public void sendMessage() {
		selectByIndex("id", "id_contact", 1);
		//selectByText("id", "id_contact", "Webmaster");
		sendData("id", "email", "abc@gmail.com");
		sendData("id", "id_order", "123A");
		sendData("id", "fileUpload", "C:\\Users\\AKKI\\Documents\\O'Reilly - Learning PHP 5.pdf");
		clickMethod("id", "message");
		sendData("id", "message", "Testing the contact us page through automation");
		clickMethod("id", "submitMessage");
	}
}
