package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_Edit_Lead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC006";
		testCaseName = "TC006_Edit_Lead";
		testDescription = "Editing an existing Lead";
		category= "Sanity";
		authors	="Bharath";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData" )
	public void DeleteLeadTest(String userName, String passWord) {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMlinkText()
		.clickLeads()
		.clickFindLead()
		.enterleadvaluefindpage("10237")
		.clickfindleadpage()
		.clickTsearchedlead()
		.EditLead();
		
		
		
	}
}