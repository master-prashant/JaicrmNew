package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tasklist {
	WebDriver driver;
	public tasklist(WebDriver driver) {
	     this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//h6[@class='MuiTypography-root MuiTypography-h6 css-vhchhm']")
	WebElement tasklisttitle;
	public WebElement tasklisttitle() {
	return tasklisttitle;
	}
}
