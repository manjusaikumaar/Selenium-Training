package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_CreateLead extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="createlead";
		testcaseName="Create Lead";
		testcaseDec = "Create Lead in Leaftaps";
		author="Manju Vani Priya";
		category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runTC001(String username, String password,String fName, String lName, String cName) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickCreateLead()
		.enterTheFirstName(fName)
		.enterTheLastName(lName)
		.enterTheCompanyName(cName)
		.clickedOnCreateLead()
		.verifyFname();
	}

}
