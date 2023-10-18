package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {
	WebDriver driver;

	public dashboard(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1kwhj2w']")
	WebElement rolename;

	public WebElement rolename() {
		return rolename;
	}

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-x5bb5h'])[2]")
	WebElement updatepassword;

	public WebElement updatepassword() {
		return updatepassword;
	}

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-x5bb5h'])[1]")
	WebElement setting;

	public WebElement setting() {
		return setting;
	}

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-x5bb5h'])[3]")
	WebElement logout;

	public WebElement logout() {
		return logout;
	}

	@FindBy(xpath = "(//a[@href='/dashboard/leadlist'])[1]")
	WebElement leadscard;

	public WebElement leadscard() {
		return leadscard;
	}

	@FindBy(xpath = "(//a[@href='/dashboard/leadlist'])[2]")
	WebElement seetodayslead;

	public WebElement seetodayslead() {
		return seetodayslead;
	}

	@FindBy(xpath = "(//a[@href='/dashboard/leadlist'])[3]")
	WebElement seeexpiringlead;

	public WebElement seeexpiringlead() {
		return seeexpiringlead;
	}

	@FindBy(xpath = "//a[@href='/dashboard/tasklist']")
	WebElement taskcard;

	public WebElement taskcard() {
		return taskcard;
	}

	@FindBy(xpath = "//a[@href='/dashboard/opportunitylist']")
	WebElement opportunitiscard;

	public WebElement opportunitiscard() {
		return opportunitiscard;
	}

	@FindBy(xpath = "//a[@href='/dashboard/coflist']")
	WebElement coflistcard;

	public WebElement coflistcard() {
		return coflistcard;
	}

	@FindBy(xpath = "//a[@href='/dashboard/servicelist']")
	WebElement servicelistcard;

	public WebElement servicelistcard() {
		return servicelistcard;
	}

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1anq1r8'])[1]")
	WebElement usersicon;

	public WebElement usersicon() {
		return usersicon;
	}

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1anq1r8'])[2]")
	WebElement contacticon;

	public WebElement contacticon() {
		return contacticon;
	}

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1anq1r8'])[3]")
	WebElement companiesicon;

	public WebElement companiesicon() {
		return companiesicon;
	}

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1anq1r8'])[4]")
	WebElement notificationsicon;

	public WebElement notificationsicon() {
		return notificationsicon;
	}

	@FindBy(xpath = "//div[@class='MuiBox-root css-1p4qd46']")
	WebElement plusicon;

	public WebElement plusicon() {
		return plusicon;
	}

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1yeip7f'])[3]")
	WebElement createlead;

	public WebElement createlead() {
		return createlead;
	}

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1yeip7f'])[1]")
	WebElement reportbug;

	public WebElement reportbug() {
		return reportbug;
	}

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1yeip7f'])[2]")
	WebElement createtask;

	public WebElement createtask() {
		return createtask;
	}

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1yeip7f'])[4]")
	WebElement createcontact;

	public WebElement createcontact() {
		return createcontact;
	}

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1yeip7f'])[5]")
	WebElement createaddress;

	public WebElement createaddress() {
		return createaddress;
	}

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1yeip7f'])[6]")
	WebElement createcompany;

	public WebElement createcompany() {
		return createcompany;
	}

	@FindBy(xpath = "(//span[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-1yeip7f'])[7]")
	WebElement createuser;

	public WebElement createuser() {
		return createuser;
	}

	@FindBy(xpath = "//div[@class='MuiBox-root css-130f8nx']")
	WebElement logo;
	
	public WebElement logo() {
		return logo;
	}

	@FindBy(xpath = "//input[@id='search_for']")
	WebElement searchfordropdown;

	public WebElement searchfordropdown() {
		return searchfordropdown;
	}

	@FindBy(xpath = "//input[@id='search_value']")
	WebElement searchvalue;

	public WebElement searchvalue() {
		return searchvalue;
	}
	
	@FindBy(xpath = "//*[@id='search_value-option-0']")
	WebElement compdrofirst;

	public WebElement compdrofirst() {
		return compdrofirst;
	}
	
	@FindBy(xpath = "//div[@class='swal-title']")
	WebElement swalmsg;

	public WebElement swalmsg() {
		return swalmsg;
	}

	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	WebElement okswalbtn;

	public WebElement okswalbtn() {
		return okswalbtn;
	}
	
	@FindBy(xpath = "//*[@id='search_for-option-0']")

	WebElement compvalue;

	public WebElement compvalue() {
		return compvalue;
	}
	
	@FindBy(xpath = "//*[@id='combo-box-demo-option-1']")
	WebElement leadvalue;

	public WebElement leadvalue() {
		return leadvalue;
	}
	
	@FindBy(xpath = "//*[@id='combo-box-demo-option-2']")
	WebElement oppvalue;

	public WebElement oppvalue() {
		return leadvalue;
	}
	
	
	
}
