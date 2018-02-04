package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_Delete_Lead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004";
		testCaseName = "TC004_Create_Lead";
		testDescription = "Creating A New Lead";
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
		.enterleadvaluefindpage("10119")
		.clickfindleadpage()
		.captureLeadId()
		.clickleadtobedeleted()
		.DeleteLead()
		.clickFindLead()
		.enterleadvaluefindpage("10119")
		.clickfindleadpage()
		.captureLeadId()
		.closeBrowser();
		
		

			}
}