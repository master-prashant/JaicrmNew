package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class companyprofile {
	WebDriver driver;

	public companyprofile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-jyjytz']")
	WebElement companyname;

	public WebElement companyname() {
		return companyname;
	}

	@FindBy(xpath = "//a[@href='/dashboard/profile/companyLeads']")
	WebElement leadcard;

	public WebElement leadcard() {
		return leadcard;
	}

	@FindBy(xpath = "//button[@id='edit_company']")
	WebElement editcomp;

	public WebElement editcomp() {
		return editcomp;
	}

	@FindBy(xpath = "//button[@id='create_contact1']")
	WebElement addcontactwhennocontact;

	public WebElement addcontactwhennocontact() {
		return addcontactwhennocontact;
	}

	@FindBy(xpath = "//button[@id='create_contact2']")
	WebElement addcontactComman;

	public WebElement addcontactComman() {
		return addcontactComman;
	}

	@FindBy(xpath = "//button[@id='create_address1']")
	WebElement commanaddaddress;

	public WebElement commanaddaddress() {
		return commanaddaddress;
	}

	@FindBy(xpath = "//button[@id='create_address2']")
	WebElement crregisteroff;

	public WebElement crregisteroff() {
		return crregisteroff;
	}

	@FindBy(xpath = "//button[@id='create_address3']")
	WebElement crheadoff;

	public WebElement crheadoff() {
		return crheadoff;
	}

	@FindBy(xpath = "//button[@id='create_address4']")
	WebElement crbranchoff;

	public WebElement crbranchoff() {
		return crheadoff;
	}
	
	@FindBy(xpath = "(//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-xeat4t'])[1]")
	WebElement radioRegister;

	public WebElement radioRegister() {
		return radioRegister;
	}
	
	@FindBy(xpath = "(//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-xeat4t'])[2]")
	WebElement radiorHead;

	public WebElement radiorHead() {
		return radiorHead;
	}
	
	@FindBy(xpath = "//label[@class='MuiFormControlLabel-root MuiFormControlLabel-labelPlacementEnd css-1jaw3da']")
	WebElement radioBranch;

	public WebElement radioBranch() {
		return radioBranch;
	}
	
}
