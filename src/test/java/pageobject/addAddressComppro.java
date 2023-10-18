package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addAddressComppro {
	WebDriver driver;

	public addAddressComppro(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[@class='MuiTypography-root MuiTypography-h5 css-19qtsk7']")
	WebElement companyname;

	public WebElement companyname() {
		return companyname;
	}
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-sgb7jl']")
	WebElement textforcreate;

	public WebElement textforcreate() {
		return textforcreate;
	}
	
	@FindBy(xpath = "//div[@id='country']")
	WebElement selectCountry;

	public WebElement selectCountry() {
		return selectCountry;
	}
	
	@FindBy(xpath = "//div[@id='state']")
	WebElement selectState;

	public WebElement selectState() {
		return selectState;
	}
	@FindBy(xpath = "//div[@id='city']")
	WebElement selectCity;

	public WebElement selectCity() {
		return selectCity;
	}
	
	@FindBy(xpath = "//input[@name='pincode']")
	WebElement pincode;

	public WebElement pincode() {
		return pincode;
	}
	
	@FindBy(xpath = "//textarea[@name='address']")
	WebElement address;

	public WebElement address() {
		return address;
	}
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	public WebElement email() {
		return email;
	}
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;

	public WebElement phone() {
		return phone;
	}
	
	@FindBy(xpath = "//input[@name='gstno']")
	WebElement gstno;

	public WebElement gstno() {
		return gstno;
	}
	
	@FindBy(xpath = "//input[@name='sez']")
	WebElement sez;

	public WebElement sez() {
		return sez;
	}
	
	@FindBy(xpath = "//input[@name='gst_waiver']")
	WebElement gstwavier;

	public WebElement gstwavier() {
		return gstwavier;
	}
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement sameforHOcheck;

	public WebElement sameforHOcheck() {
		return sameforHOcheck;
	}
	
	@FindBy(xpath = "(//button[@aria-label='close'])[3]")  //change
	WebElement close;
	
	public WebElement close() {
		return close;
	}
	@FindBy(xpath = "//button[@id='save_address']")  
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
	
	@FindBy(xpath = "//li[@role='option']")  
	List<WebElement> dropdownlist;
	
	public List<WebElement> dropdownlist() {
		return dropdownlist;
	}
	
	@FindBy(xpath = "//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']")  
	WebElement gstwavendDate;
	
	public WebElement gstwavendDate() {
		return gstwavendDate;
	}
}
