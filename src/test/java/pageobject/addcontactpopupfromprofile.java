package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addcontactpopupfromprofile {
	WebDriver driver;

	public addcontactpopupfromprofile(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[@class='MuiTypography-root MuiTypography-h5 css-19qtsk7']")
	WebElement compnametitle;
	
	public WebElement compnametitle() {
		return compnametitle;
	}

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement firstname;
	
	public WebElement firstname() {
		return firstname;
	}

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement lastname;
	
	public WebElement lastname() {
		return lastname;
	}
	
	@FindBy(xpath = "//button[@aria-label='Choose date']")
	WebElement datepicker;
	
	public WebElement datepicker() {
		return datepicker;
	}
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	
	public WebElement email() {
		return email;
	}
	
	@FindBy(xpath = "//div[@id='select_designation']")
	WebElement designation;
	
	public WebElement designation() {
		return designation;
	}
	
	@FindBy(xpath = "//li[@role='option']")
	List<WebElement> listdesign;
	
	public List<WebElement> listdesign() {
		return listdesign;
	}
	
	@FindBy(xpath = "//input[@name='extendedDesignation']")
	WebElement extdesignation;
	
	public WebElement extdesignation() {
		return extdesignation;
	}
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	
	public WebElement phone() {
		return phone;
	}
	
	@FindBy(xpath = "//input[@name='officephone']")
	WebElement officephone;
	
	public WebElement officephone() {
		return officephone;
	}
	
	@FindBy(xpath = "//input[@name='department']")
	WebElement department;
	
	public WebElement department() {
		return department;
	}
	
	@FindBy(xpath = "//input[@name='linkdin']")
	WebElement linkdin;
	
	public WebElement linkdin() {
		return linkdin;
	}
	
	@FindBy(xpath = "//input[@name='twitter']")
	WebElement twitter;
	
	public WebElement twitter() {
		return twitter;
	}
	
	@FindBy(xpath = "(//button[@aria-label='close'])[1]")  //change
	WebElement close;
	
	public WebElement close() {
		return close;
	}
	@FindBy(xpath = "//button[@id='save_contact']")  
	WebElement save;
	
	public WebElement save() {
		return save;
	}
	
	@FindBy(xpath = "//div[@class='swal-title']")  
	WebElement swalerror;
	
	public WebElement swalerror() {
		return swalerror;
	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")  
	WebElement okswal;
	
	public WebElement okswal() {
		return okswal;
	}
}
