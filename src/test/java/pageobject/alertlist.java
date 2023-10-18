package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class alertlist {
	WebDriver driver;
	public alertlist(WebDriver driver) {
	     this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="(//button[@tabindex='0'])[1]")
	WebElement followuptab;
	public WebElement followuptab() {
	return followuptab;
	}
	
	@FindBy(xpath="(//button[@tabindex='0'])[2]")
	WebElement tasktab;
	public WebElement tasktab() {
	return tasktab;
	}
	
	@FindBy(xpath="(//button[@tabindex='0'])[3]")
	WebElement create;
	public WebElement create() {
	return create;
	}
	
	
}
