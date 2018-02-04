package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_Create_Lead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_Create_Lead";
		testDescription = "Creating A New Lead";
		category= "Sanity";
		authors	="Bharath";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData" )
	public void CreateLeadTest(String userName, String passWord) {
		
		new LoginPage(driver,test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMlinkText()
		.clickLeads()
		.clickCreateLead()
		.entercmpname("Cognizant")
		.enterfname("Bharath")
		.enterlname("Sharma")
		.selectSource("Employee")
		.enterlocFname("bsj")
		.enterPersonalTitle("QA TestEngineer")
		.enterProfileTitle("TestEngineer")
		.enterAnnualRevenue("40000$")
		.selectIndustry("Distribution")
		.selectOwnership("Sole Proprietorship")
		.entersicCode("385694")
		.enterdescription("This test is an Automated Text")
		.enterimpnote("Test NG was Used to automate this ")
		.entercountrycode("203")
		.enterprimareacode("204")
		.enterphoneextention("231")
		.enterprimarymail("bharathmanunited@gmail.com")
		.clickSmallSubmit();
		
		
	}

}
