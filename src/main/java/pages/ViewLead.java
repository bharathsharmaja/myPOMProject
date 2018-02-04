package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyName;
		@Override
		public void verifyPartialText(WebElement ele, String expectedText) {
			// TODO Auto-generated method stub
			super.verifyPartialText(eleCompanyName, expectedText);

		}
			@FindBy(how=How.LINK_TEXT,using="Delete")
			private WebElement deleteLeads;
			public MyLeadPage DeleteLead() {
				click(deleteLeads);
				return new MyLeadPage(driver, test);
			}
			
			@FindBy(how=How.XPATH,using="//button[text() ='Find Leads']")
			private WebElement clickbuttonfindlead;
			public FindLeadPage clickfindleadpage() {
				click(clickbuttonfindlead); 
				return new FindLeadPage(driver, test);
			}
			
			
			@FindBy(how=How.LINK_TEXT,using="Edit")
			private WebElement EditLeads;
			public MyLeadPage EditLead() {
				click(EditLeads);
				return new MyLeadPage(driver, test);
			}
			
			
			
	}
	
		

