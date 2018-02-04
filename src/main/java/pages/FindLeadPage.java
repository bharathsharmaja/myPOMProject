package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{

	public String leadvalue ;
	public FindLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="id")
	private WebElement leadEntry; {
		
	}
	
	@FindBy(how=How.XPATH,using="//button[text() ='Find Leads']")
	private WebElement clickbuttonfindlead;
	public FindLeadPage clickfindleadpage() {
		click(clickbuttonfindlead); 
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="10119")
	private WebElement openleadss;
	public ViewLead clickleadtobedeleted() {
		click(openleadss); 
		return new ViewLead(driver, test);
	}
	
	@FindBy(how=How.NAME,using="id")
	private WebElement typeleadid;
	public FindLeadPage enterleadvaluefindpage(String leadvalue) {
		type(typeleadid, leadvalue); 
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="10119")
	private WebElement leadvaluess;
	public FindLeadPage captureLeadId() {
		firstResLeadId = getText(leadvaluess);
		return this;
	}	
	
	@FindBy(how=How.LINK_TEXT,using="10236")
	private WebElement eleSelectFromLead;
	public MergeLead clickFromleadtobeSelected() {
		click(eleSelectFromLead); 
		switchToWindow(0);
		return new MergeLead(driver, test);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="10237")
	private WebElement eleSelectToLead;
	public MergeLead clickToLeadtobeSelected() {
		click(eleSelectToLead); 
		switchToWindow(0);
		return new MergeLead(driver, test);
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="10237")
	private WebElement eleSelectsearchedLead;
	public ViewLead clickTsearchedlead() {
		click(eleSelectsearchedLead); 
		return new ViewLead(driver, test);
	}
	
	
	
	
	
}