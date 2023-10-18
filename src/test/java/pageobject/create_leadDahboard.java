package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class create_leadDahboard {
	WebDriver driver;
	public create_leadDahboard(WebDriver driver) {
	     this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@id='select_company']")
	WebElement selectcomp;
	public WebElement selectcomp() {
	return selectcomp;
	}
	
	@FindBy(xpath="//*[@id='select_company-option-0']")
	WebElement compoption;
	public WebElement compoption() {
	return compoption;
	}
	
	@FindBy(xpath="//div[@id='select_address']")
	WebElement selectaddress;
	public WebElement selectaddress() {
	return selectaddress;
	}
	
	@FindBy(xpath="//li[@tabindex='0']")
	WebElement addresslist;
	public WebElement addresslist() {
	return addresslist;
	}
	
	@FindBy(xpath="//div[@id='select_contact']")
	WebElement selectcontact;
	public WebElement selectcontact() {
	return selectcontact;
	}
	
	@FindBy(xpath="(//li[@role='option'])[2]")
	WebElement contactlist;
	public WebElement contcatlist() {
	return contactlist;
	}
	
	@FindBy(xpath="//button[@aria-label='Create New Company']")
	WebElement createcomp;
	public WebElement createcomp() {
	return createcomp;
	}	
	
	@FindBy(xpath="//button[@aria-label='Create New Address']")
	WebElement createadd;
	public WebElement createadd() {
	return createadd;
	}
	
	@FindBy(xpath="//button[@aria-label='Create New Contact']")
	WebElement createcont;
	public WebElement createcont() {
	return createcont;
	}
	
	@FindBy(xpath="//div[@id='select_type']")
	WebElement selecttype;
	public WebElement selecttype() {
	return selecttype;
	}
	
	@FindBy(xpath="//li[@data-value='Hot']")
	WebElement hot;
	public WebElement hottype() {
	return hot;
	}
	
	@FindBy(xpath="//li[@data-value='Warm']")
	WebElement warm;
	public WebElement warmtype() {
	return warm;
	}
	
	@FindBy(xpath="//li[@data-value='Cold']")
	WebElement Cold;
	public WebElement Coldtype() {
	return Cold;
	}
	
	@FindBy(xpath="//input[@name='lead_name']")
	WebElement leadname;
	public WebElement leadname() {
	return leadname;
	}
	
	@FindBy(xpath="//div[@id='select_source']")
	WebElement selectsource;
	public WebElement selectsource() {
	return selectsource;
	}
	
	@FindBy(xpath="//li[@data-value='ExistingCustomer']")
	WebElement sourceExicust;
	public WebElement sourceExicust() {
	return sourceExicust;
	}
	
	@FindBy(xpath="//li[@data-value='Email']")
	WebElement sourceEmail;
	public WebElement sourceEmail() {
	return sourceEmail;
	}
	
	@FindBy(xpath="//li[@data-value='Networking']")
	WebElement sourcenetwork;
	public WebElement sourcenetwork() {
	return sourcenetwork;
	}
	
	@FindBy(xpath="//li[@data-value='ParentOrganization']")
	WebElement sourceparorg;
	public WebElement sourceparorg() {
	return sourceparorg;
	}
	
	@FindBy(xpath="//li[@data-value='SelfGenerated']")
	WebElement sourceSelfGene;
	public WebElement sourceSelfGene() {
	return sourceSelfGene;
	}
	
	@FindBy(xpath="//li[@data-value='Telecalling']")
	WebElement sourcetelcall;
	public WebElement sourcetelcall() {
	return sourcetelcall;
	}
	
	@FindBy(xpath="//li[@data-value='Tradeindia']")
	WebElement sourcetradeind;
	public WebElement sourcetradeind() {
	return sourcetradeind;
	}
	
	@FindBy(xpath="//input[@name='data_source']")
	WebElement datasource;
	public WebElement datasource() {
	return datasource;
	}
	
	@FindBy(xpath="//div[@id='service_provider']")  
	WebElement selectserviceprovider;
	public WebElement selectserviceprovider() {
	return selectserviceprovider;
	}
	
	@FindBy(xpath="//li[@role='option']")
	List<WebElement> servprovlist;
	public List<WebElement> servprovlist() {
	return servprovlist;
	}
	
	
	@FindBy(xpath="//div[@id='product_family']")
	WebElement selectproductfamily;
	public WebElement selectproductfamily() {
	return selectproductfamily;
	}
	
	@FindBy(xpath="//li[@role='option']")
	List<WebElement>  prodfamlist;
	public List<WebElement>  prodfamlist() {
	return prodfamlist;
	}
	
	@FindBy(xpath="//div[@id='product']")
	WebElement selectproduct;
	public WebElement selectproduct() {
	return selectproduct;
	}
	
	@FindBy(xpath="//li[@role='option']")
	List<WebElement>  productist;
	public List<WebElement>  productist() {
	return productist;
	}
	
	@FindBy(xpath="//textarea[@name='summary']")
	WebElement summary;
	public WebElement summary() {
	return summary;
	}
	
	@FindBy(xpath="//button[@id='save']")
	WebElement save;
	public WebElement savebtn() {
	return save;
	}
	
	@FindBy(xpath="//button[@class='swal-button swal-button--Cancel popup-blue']")
	WebElement leadlistbtn;
	public WebElement leadlistbtn() {
	return leadlistbtn;
	}
	
	@FindBy(xpath="//button[@class='swal-button swal-button--Delete popup-gray']")
	WebElement compprofbtn;
	public WebElement compprofbtn() {
	return compprofbtn;
	}
	
	@FindBy(xpath="(//small[@style='color: red;'])[1]")
	WebElement seladderror;
	public WebElement seladderror() {
	return seladderror;
	}
	
	@FindBy(xpath="(//small[@style='color: red;'])[2]")
	WebElement selconerror;
	public WebElement selconerror() {
	return selconerror;
	}
	
	@FindBy(xpath="(//small[@style='color: red;'])[3]")
	WebElement seltypeerror;
	public WebElement seltypeerror() {
	return seltypeerror;
	}
	
	@FindBy(xpath="(//small[@style='color: red;'])[4]")
	WebElement leadnameerror;
	public WebElement leadnameerror() {
	return leadnameerror;
	}
	
	@FindBy(xpath="(//small[@style='color: red;'])[5]")
	WebElement sourceerror;
	public WebElement sourceerror() {
	return sourceerror;
	}
	
	@FindBy(xpath="(//small[@style='color: red;'])[6]")
	WebElement datasourceerror;
	public WebElement datasourceerror() {
	return datasourceerror;
	}
	
	@FindBy(xpath="(//small[@style='color: red;'])[7]")
	WebElement serproverror;
	public WebElement serproverror() {
	return serproverror;
	}
	
	@FindBy(xpath="(//small[@style='color: red;'])[8]")
	WebElement prodfamerror;
	public WebElement prodfamerror() {
	return prodfamerror;
	}
	
	@FindBy(xpath="(//small[@style='color: red;'])[9]")
	WebElement proderror;
	public WebElement proderror() {
	return proderror;
	}
	
	@FindBy(xpath="(//small[@style='color: red;'])[10]")
	WebElement summerror;
	public WebElement summerror() {
	return summerror;
	}
	
	@FindBy(xpath="//div[@class='swal-title']")
	WebElement addproderror;
	public WebElement addproderror() {
	return addproderror;
	}
	
	@FindBy(xpath="//div[@class='swal-title']")
	WebElement addprodfamerror;
	public WebElement addprodfamerror() {
	return addprodfamerror;
	}
	
	@FindBy(xpath="//button[@class='swal-button swal-button--confirm']")
	WebElement okswal;
	public WebElement okswal() {
	return okswal;
	}
	//error message pending
}
