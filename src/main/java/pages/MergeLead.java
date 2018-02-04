package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLead extends ProjectMethods{
	
	public MergeLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMegreLead;
	public MergeLead clickMegreLead() {
		click(eleMegreLead);
		return new MergeLead(driver, test);
	}
	
	
	@FindBy(how=How.XPATH,using="//img[@src ='/images/fieldlookup.gif']")
	private WebElement eleFromLead;
	public FindLeadPage clickFromLead() {
		click(eleFromLead);
		switchToWindow(1);
		return new FindLeadPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src ='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLead;
	public FindLeadPage clickToLead() {
		click(eleToLead);
		switchToWindow(1);
		return new FindLeadPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergeLead;
	public ViewLead clickMergeLeadButton() throws Throwable {
		click(eleMergeLead);
		return new ViewLead(driver, test);
	}

}
		

