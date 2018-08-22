package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	public CreateLeadPage entercmpname(String compname) {
		type(eleCompanyName, compname);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefirstName;
	public CreateLeadPage enterfname(String fname) {
		type(elefirstName, fname);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeadPage enterlname(String lname) {
		type(eleLastName, lname);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleSmallSubmit;
	public ViewLead clickSmallSubmit() {
		click(eleSmallSubmit);
		return new ViewLead(driver, test);
	}
	
	@FindBy(how=How.NAME,using="dataSourceId")
	private WebElement selectSource;
	public CreateLeadPage selectSource(String visibleText) {
		Select source = new Select(selectSource);
		List<WebElement> alloptions =source.getOptions();
		source.selectByVisibleText(visibleText);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstNameLocal")
	private WebElement localFirstname;
	public CreateLeadPage enterlocFname(String lname) {
		type(localFirstname, lname);
		return this;
		
	}
	
	
	@FindBy(how=How.NAME,using="personalTitle")
	private WebElement personalTitle;
	public CreateLeadPage enterPersonalTitle(String pTitle) {
		type(personalTitle, pTitle);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_generalProfTitle")
	private WebElement profileTitle;
	public CreateLeadPage enterProfileTitle(String profTitle) {
		type(profileTitle, profTitle);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement selindustry;
	public CreateLeadPage selectIndustry(String visibleText) {
		Select source = new Select(selindustry);
		List<WebElement> alloptions =source.getOptions();
		source.selectByVisibleText(visibleText);
		return this;
	}
	
	@FindBy(how=How.NAME,using="annualRevenue")
	private WebElement annualRevenue;
	public CreateLeadPage enterAnnualRevenue(String annualrev) {
		type(annualRevenue, annualrev);
		return this;
	
	}
	
	@FindBy(how=How.ID,using="createLeadForm_ownershipEnumId")
	private WebElement selectOwnership;
	public CreateLeadPage selectOwnership(String ownership) {
		Select source = new Select(selectOwnership);
		List<WebElement> alloptions =source.getOptions();
		source.selectByVisibleText(ownership);
		return this;
	}
	
	@FindBy(how=How.NAME,using="sicCode")
	private WebElement sicCodeentry;
	public CreateLeadPage entersicCode(String sCode) {
		type(sicCodeentry, sCode);
		return this;
	}	
	
	
	@FindBy(how=How.NAME,using="description")
	private WebElement descriptionbox;
	public CreateLeadPage enterdescription(String descnote) {
		type(descriptionbox, descnote);
		return this;
	
	}
	
	@FindBy(how=How.NAME,using="importantNote")
	private WebElement importantNotebox;
	public CreateLeadPage enterimpnote(String impnote) {
		type(importantNotebox, impnote);
		return this;
	
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneCountryCode")
	private WebElement pccode;
	public CreateLeadPage entercountrycode(String primcoucode) {
		type(pccode, primcoucode);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneAreaCode")
	private WebElement areacode;
	public CreateLeadPage enterprimareacode(String primareacode) {
		type(areacode, primareacode);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneExtension")
	private WebElement phonenextention;
	public CreateLeadPage enterphoneextention(String phoneExtension) {
		type(phonenextention, phoneExtension);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement primEmail;
	public CreateLeadPage enterprimarymail(String primaryEmail) {
		type(primEmail, primaryEmail);
		return this;
	}

	
	
	
		
}
