package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;


public class MyHomePage extends SeleniumBase{
public LeadsPage clickLeads() {
	click(locateElement("xpath","//a[@href='/crmsfa/control/leadsMain']"));
	return new LeadsPage();
}
}
