package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeadPage extends ProjectMethods{
	
	public MyLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	public CreateLeadPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadPage(driver, test);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLead;
	public FindLeadPage clickFindLead() {
		click(eleFindLead);
		return new FindLeadPage(driver, test);
	}
	
	
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMegreLead;
	public MergeLead clickMegreLead() {
		click(eleMegreLead);
		return new MergeLead(driver, test);
	}
	
	
	
	
	
	
	
	
	
	

}
