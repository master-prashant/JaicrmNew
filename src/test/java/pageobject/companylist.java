package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class companylist {
	WebDriver driver;
	public companylist(WebDriver driver) {
	     this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h6[@class='MuiTypography-root MuiTypography-h6 css-vhchhm']")
	WebElement companylisttitle;
	public WebElement companylisttitle() {
	return companylisttitle;
	}
	
	@FindBy(xpath="//input[@placeholder='Search Company']")
	WebElement searchcomp;
	public WebElement searchcomp() {
	return searchcomp;
	}
	
	@FindBy(xpath="//button[@id='create']")
	WebElement createcomp;
	public WebElement createcomp() {
	return createcomp;
	}
}
