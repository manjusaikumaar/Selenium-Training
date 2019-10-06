package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class LeadsPage extends SeleniumBase{
public CreateLeadPage clickCreateLead() {
	click(locateElement("link","Create Lead"));
	return new CreateLeadPage();
}
}
