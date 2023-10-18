package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createcomp_float {
	WebDriver driver;

	public createcomp_float(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@aria-label='close']")
	WebElement closebtn;

	public WebElement closebtn() {
		return closebtn;
	}

	@FindBy(xpath = "//div[@id='demo-simple-select']")
	WebElement companytypebtn;

	public WebElement companytypebtn() {
		return companytypebtn;
	}

	@FindBy(xpath = "//div[@class='swal-title']")
	WebElement existcomp;

	public WebElement existcomp() {
		return existcomp;
	}

	@FindBy(xpath = "//li[@data-value='PRIVATE LIMITED']")
	WebElement prvltd;

	public WebElement prvltd() {
		return prvltd;
	}

	@FindBy(xpath = "//li[@data-value='LIMITED']")
	WebElement ltd;

	public WebElement ltd() {
		return ltd;
	}

	@FindBy(xpath = "//li[@data-value='LLP']")
	WebElement llp;

	public WebElement llp() {
		return llp;
	}

	@FindBy(xpath = "//li[@data-value='NGO']")
	WebElement ngo;

	public WebElement ngo() {
		return ngo;
	}

	@FindBy(xpath = "//li[@data-value='TRUST']")
	WebElement trust;

	public WebElement trust() {
		return trust;
	}

	@FindBy(xpath = "//li[@data-value='PROPRIETOR']")
	WebElement PROPRIETOR;

	public WebElement PROPRIETOR() {
		return PROPRIETOR;
	}

	@FindBy(xpath = "//li[@data-value='FOREIGN ENTITY']")
	WebElement foreignent;

	public WebElement foreignent() {
		return foreignent;
	}

	@FindBy(xpath = "//li[@data-value='OTHERS']")
	WebElement others;

	public WebElement others() {
		return others;
	}

	@FindBy(xpath = "//input[@id='company name']")
	WebElement companyname;

	public WebElement companyname() {
		return companyname;
	}

	@FindBy(xpath = "//input[@id='companyFullName']")
	WebElement companyFullName;

	public WebElement companyFullName() {
		return companyFullName;
	}

	@FindBy(xpath = "//button[@id='validate']")
	WebElement validatebtn;

	public WebElement validatebtn() {
		return validatebtn;
	}

	@FindBy(xpath = "(//div[@id='demo-simple-select'])[2]")
	WebElement industrytype;

	public WebElement industrytype() {
		return industrytype;
	}

	@FindBy(xpath = "//input[@name='website']")
	WebElement website;

	public WebElement website() {
		return website;
	}

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[1]")
	WebElement date;

	public WebElement dateofincop() {
		return date;
	}

	@FindBy(xpath = "//input[@name='cin']")
	WebElement cin;

	public WebElement cin() {
		return cin;
	}

	@FindBy(xpath = "//input[@name='tan']")
	WebElement tan;

	public WebElement tan() {
		return tan;
	}

	@FindBy(xpath = "//input[@name='pan']")
	WebElement pan;

	public WebElement pan() {
		return pan;
	}

	@FindBy(xpath = "//input[@name='turnover']")
	WebElement amount;

	public WebElement amount() {
		return amount;
	}

	@FindBy(xpath = "(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]")
	WebElement date1;

	public WebElement asondate() {
		return date1;
	}

	@FindBy(xpath = "//textarea[@name='summary']")
	WebElement summary;

	public WebElement summary() {
		return summary;
	}

	@FindBy(xpath = "//button[@id='save']")
	WebElement savebtn;

	public WebElement savebtn() {
		return savebtn;
	}

	@FindBy(xpath = "(//small[@style='color: red;'])[1]")
	WebElement indtyperror;

	public WebElement indtyperror() {
		return indtyperror;
	}

	@FindBy(xpath = "(//small[@style='color: red;'])[2]")
	WebElement websiterror;

	public WebElement websiterror() {
		return websiterror;
	}

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-7pmyr6'])")
	WebElement iderror;

	public WebElement iderror() {
		return iderror;
	}

	@FindBy(xpath = "(//small[@style='color: red;'])[3]")
	WebElement turnerror;

	public WebElement turnerror() {
		return turnerror;
	}

	@FindBy(xpath = "(//small[@style='color: red;'])[4]")
	WebElement summaryerror;

	public WebElement summaryerror() {
		return summaryerror;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--Delete popup-blue']")
	WebElement addadress;

	public WebElement addadress() {
		return addadress;					//after company create swal
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--Cancel popup-gray']")
	WebElement companyprofile;

	public WebElement companyprofilebtn() {				//after company create swal
		return companyprofile;
	}

}
