package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	WebDriver driver;

	public loginpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement email;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement btn;
	@FindBy(xpath = "//small[@style='color: red;']")
	WebElement errormessage;
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1wzpxsl']")
	WebElement forgotpass;

	public WebElement forgotpass() {
		return forgotpass;
	}

	public WebElement errormessage() {
		return errormessage;
	}

	public WebElement email() {
		return email;
	}

	public WebElement password() {
		return password;
	}

	public WebElement btn() {
		return btn;
	}

}
