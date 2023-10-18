package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactlist {
	WebDriver driver;
	public contactlist(WebDriver driver) {
	     this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h6[@class='MuiTypography-root MuiTypography-h6 css-vhchhm']")
	WebElement contactlisttitle;
	public WebElement contactlisttitle() {
	return contactlisttitle;
	}

}
