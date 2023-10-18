package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leaddetails {
	WebDriver driver;

	public leaddetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='create_followup']")
	WebElement createfollowup_first;

	public WebElement createfollowup_first() {
		return createfollowup_first;
	}

	@FindBy(xpath = "(//button[@id='working_days'])[1]")
	WebElement todaysdate;

	public WebElement todaysdate() {
		return todaysdate;
	}

	@FindBy(xpath = "(//button[@id='working_days'])[2]")
	WebElement tomarrowdate;

	public WebElement tomarrowdate() {
		return tomarrowdate;
	}

	@FindBy(xpath = "(//button[@id='hours'])[1]")
	WebElement firsthour;

	public WebElement selfirsthourecthr() {
		return firsthour;
	}

	@FindBy(xpath = "(//button[@id='minutes'])[1]")
	WebElement firstminute;

	public WebElement firstminute() {
		return firstminute;
	}

	@FindBy(xpath = "//button[@id='am']")
	WebElement am;

	public WebElement am() {
		return am;
	}

	@FindBy(xpath = "//button[@id='pm']")
	WebElement pm;

	public WebElement pm() {
		return pm;
	}

	@FindBy(xpath = "(//button[@id='followupType'])[1]")
	WebElement meeting;

	public WebElement meeting() {
		return meeting;
	}

	@FindBy(xpath = "(//button[@id='followupType'])[2]")
	WebElement demo;

	public WebElement demo() {
		return demo;
	}

	@FindBy(xpath = "(//button[@id='followupType'])[3]")
	WebElement call;

	public WebElement call() {
		return call;
	}

	@FindBy(xpath = "(//button[@id='followupType'])[4]")
	WebElement email;

	public WebElement email() {
		return email;
	}

	@FindBy(xpath = "//button[@id='save']")
	WebElement save;

	public WebElement save() {
		return save;
	}

	@FindBy(xpath = "//button[@id='validate']")
	WebElement validatelead;

	public WebElement validatelead() {
		return validatelead;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--Cancel popup-gray']")
	WebElement no_validatepop;

	public WebElement no_validatepop() {
		return no_validatepop;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--Delete popup-blue']")
	WebElement yes_validatepop;

	public WebElement yes_validatepop() {
		return yes_validatepop;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	WebElement okswal;

	public WebElement okswal() {
		return okswal;
	}

	@FindBy(xpath = "//button[@id='convert_to_opportunity']")
	WebElement converttoopportunityTop;

	public WebElement converttoopportunityTop() {
		return converttoopportunityTop;
	}

	@FindBy(xpath = "//button[@id='convert_opporunity']")
	WebElement converttoopportunityFollowup;

	public WebElement converttoopportunityFollowup() {
		return converttoopportunityFollowup;
	}

	@FindBy(xpath = "//button[@id='new_follow-Up']")
	WebElement newfollowup;

	public WebElement newfollowup() {
		return newfollowup;
	}

	@FindBy(xpath = "//button[@id='lead_lost']")
	WebElement leadlost;

	public WebElement leadlost() {
		return leadlost;
	}

	@FindBy(xpath = "//textarea[@name='closingRemark']")
	WebElement closingremark;

	public WebElement closingremark() {
		return closingremark;
	}

	@FindBy(xpath = "//button[@id='assign_lead']")
	WebElement assignlead;

	public WebElement assignlead() {
		return assignlead;
	}

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-185v5jy']")
	WebElement validatedtext;

	public WebElement validatedtext() {
		return validatedtext;
	}

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-15d4t32']")
	WebElement websitelink;

	public WebElement websitelink() {
		return websitelink;
	}

	@FindBy(xpath = "//p[@id='edit_lead']")
	WebElement editlead;

	public WebElement editlead() {
		return editlead;
	}

	@FindBy(xpath = "(//span[@class='MuiStepLabel-labelContainer MuiStepLabel-alternativeLabel css-h2cmlr'])[3]")
	WebElement lostleadstatus;

	public WebElement lostleadstatus() {
		return lostleadstatus;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--Delete popup-gray']")
	WebElement no_lost;

	public WebElement no_lost() {
		return no_lost;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--Cancel popup-blue']")
	WebElement yes_lost;

	public WebElement yes_lost() {
		return yes_lost;
	}
	
	@FindBy(xpath = "//span[@id='close_button']")
	WebElement closeFollopop;

	public WebElement closeFollopop() {
		return closeFollopop;
	}
	
	@FindBy(xpath = "//div[@class='swal-title']")
	WebElement pasterror;

	public WebElement pasterror() {
		return pasterror;
	}
}
