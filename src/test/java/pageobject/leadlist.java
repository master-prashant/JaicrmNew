package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leadlist {
	WebDriver driver;

	public leadlist(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h6[@class='MuiTypography-root MuiTypography-h6 css-vhchhm']")
	WebElement leadlisttitle;

	public WebElement leadlisttitle() {
		return leadlisttitle;
	}

	@FindBy(xpath = "//button[@id='create']")
	WebElement createlead;

	public WebElement createlead() {
		return createlead;
	}

	@FindBy(xpath = "//tr[@class='MuiTableRow-root MuiTableRow-hover css-16ixw64']")
	List<WebElement> row;

	public List<WebElement> row() {
		return row;
	}

	@FindBy(xpath = "//table[@aria-label='sticky table']")
	WebElement table;

	public WebElement table() {
		return table;
	}

	@FindBy(xpath = "//td[@class='MuiTableCell-root MuiTableCell-body MuiTableCell-alignLeft MuiTableCell-paddingNone MuiTableCell-sizeSmall css-15kvbig']")
	List<WebElement> cell;

	public List<WebElement> cell() {
		return cell;
	}

	@FindBy(xpath = "//button[@aria-label='Go to next page']")
	WebElement nextpage;

	public WebElement nextpage() {
		return nextpage;
	}

	@FindBy(xpath = "(//p[@class='MuiTypography-root MuiTypography-body1 css-1x5s5ry'])[1]")
	WebElement firstleadintable;

	public WebElement firstleadintable() {
		return firstleadintable;
	}
}
