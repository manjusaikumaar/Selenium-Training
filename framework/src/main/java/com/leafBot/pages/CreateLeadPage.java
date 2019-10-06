package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class CreateLeadPage extends SeleniumBase{
	public CreateLeadPage enterTheFirstName(String fName) {
		clearAndType(locateElement("id", "createLeadForm_firstName"), fName);
		return this;
	}
	
	public CreateLeadPage enterTheLastName(String lName) {
		clearAndType(locateElement("id", "createLeadForm_lastName"), lName);
		return this;
	}

	public CreateLeadPage enterTheCompanyName(String cName) {
		clearAndType(locateElement("id", "createLeadForm_companyName"), cName);
		return this;
	}

	public ViewLeadsPage clickedOnCreateLead() {
		click(locateElement("class","smallSubmit"));
		return new ViewLeadsPage();
	}	

}
