package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class compprofileleadlist {
	WebDriver driver;
	public compprofileleadlist(WebDriver driver) {
	     this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//button[@id='create']")
	WebElement createlead;
	public WebElement createlead() {
	return createlead;
	}

}
