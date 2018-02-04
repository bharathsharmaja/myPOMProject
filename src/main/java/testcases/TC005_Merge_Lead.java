package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_Merge_Lead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005";
		testCaseName = "TC005_Create_Lead";
		testDescription = "Merging of Two Different Leads";
		category= "Sanity";
		authors	="Bharath";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData" )
	public void MergeLeadTest(String userName, String passWord) throws Throwable {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMlinkText()
		.clickLeads()
		.clickMegreLead()
		.clickFromLead()
		.enterleadvaluefindpage("10236")
		.clickfindleadpage()
		.clickFromleadtobeSelected()
		.clickToLead()
		.enterleadvaluefindpage("10237")
		.clickfindleadpage()
		.clickToLeadtobeSelected()
		.clickMergeLeadButton()
		.acceptAlert();
		
		
	}

}
