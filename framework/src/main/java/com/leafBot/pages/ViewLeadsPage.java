package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.selenium.api.base.SeleniumBase;

public class ViewLeadsPage extends SeleniumBase{
	public ViewLeadsPage verifyFname() {
		WebElement firstName = locateElement("xpath","//span[@id='viewLead_firstName_sp']"); 
		System.out.println("Provided First Name is: "+firstName.getText());
		return this;
	}
}

