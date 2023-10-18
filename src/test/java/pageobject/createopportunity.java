package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createopportunity {
	WebDriver driver;

	public createopportunity(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[@class='MuiTypography-root MuiTypography-h5 css-19qtsk7']")
	WebElement companame;

	public WebElement companame() {
		return companame;
	}

	@FindBy(xpath = "//input[@name='opportunity_name']")
	WebElement oppname;

	public WebElement oppname() {
		return oppname;
	}

	@FindBy(xpath = "//div[@id='contact_name']")
	WebElement selectcontact;

	public WebElement selectcontact() {
		return selectcontact;
	}

	@FindBy(xpath = "//div[@id='select_address']")
	WebElement selectaddress;

	public WebElement selectaddress() {
		return selectaddress;
	}

	@FindBy(xpath = "//input[@placeholder='dd/mm/yyyy']")
	WebElement plcholderDate;

	public WebElement plcholderDate() {
		return plcholderDate;
	}

	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']")
	WebElement datepicker;

	public WebElement datepicker() {
		return datepicker;
	}

	@FindBy(xpath = "//div[@id='business_line']")
	WebElement selectLineofBuissness;

	public WebElement selectLineofBuissness() {
		return selectLineofBuissness;
	}

	@FindBy(xpath = "//li[@data-value='IT Infrastructure']")
	WebElement itinfraStructure;

	public WebElement itinfraStructure() {
		return itinfraStructure;
	}

	@FindBy(xpath = "//li[@data-value='Software']")
	WebElement software;

	public WebElement software() {
		return software;
	}

	@FindBy(xpath = "//div[@id='product_family']")
	WebElement selectproductfamily;

	public WebElement selectproductfamily() {
		return selectproductfamily;
	}

	@FindBy(xpath = "//div[@id='product']")
	WebElement selectproduct;

	public WebElement selectproduct() {
		return selectproduct;
	}

	@FindBy(xpath = "//input[@name='service_opportunityid']")
	WebElement serviceprovOppID;

	public WebElement serviceprovOppID() {
		return serviceprovOppID;
	}

	@FindBy(xpath = "//input[@name='expected_mrc']")
	WebElement expectedmrc;

	public WebElement expectedmrc() {
		return expectedmrc;
	}

	@FindBy(xpath = "//input[@name='expected_nrc']")
	WebElement expectedNrc;

	public WebElement expectedNRC() {
		return expectedNrc;
	}

	@FindBy(xpath = "//textarea[@name='summary']")
	WebElement summary;

	public WebElement summary() {
		return summary;
	}

	@FindBy(xpath = "//button[@aria-label='close']")
	WebElement closepopup;

	public WebElement closepopup() {
		return closepopup;
	}

	@FindBy(xpath = "(//button[@id='save'])[2]")
	WebElement saveWITHfolup;

	public WebElement saveWITHfolup() {
		return saveWITHfolup;
	}

	@FindBy(xpath = "//button[@id='save']")
	WebElement savewithoutfolup;

	public WebElement savewithoutfolup() {
		return savewithoutfolup;
	}

	@FindBy(xpath = "//button[@class='swal-button swal-button--Delete popup-gray']")
	WebElement opportunitylistpopbtn;

	public WebElement opportunitylistpopbtn() {
		return opportunitylistpopbtn;
	}

	@FindBy(xpath = "//button[@class='swal-button swal-button--Cancel popup-blue']")
	WebElement opportunityDetailspopbtn;

	public WebElement opportunityDetailspopbtn() {
		return opportunityDetailspopbtn;

	}

	@FindBy(xpath = "//div[@class='swal-title']")
	WebElement swaltitle;

	public WebElement swaltitle() {
		return swaltitle;

	}
}