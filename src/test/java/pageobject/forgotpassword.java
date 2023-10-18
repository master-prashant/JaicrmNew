package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgotpassword {
	WebDriver driver;

	public forgotpassword(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	public WebElement forgotemail() {
		return email;
	}

	@FindBy(xpath = "//button[@id='validate']")
	WebElement submit;

	public WebElement submit() {
		return submit;
	}

	@FindBy(xpath = "//small[@style='color: red;']")
	WebElement errormessage;

	public WebElement errormessage() {
		return errormessage;
	}

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-pq13ty']")
	WebElement backtologin;

	public WebElement backtologin() {
		return backtologin;
	}
}
