package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class HomePage extends SeleniumBase{
	public MyHomePage clickCrmsfa() {
		click(locateElement("link","CRM/SFA"));
		return new MyHomePage();
	}

}
