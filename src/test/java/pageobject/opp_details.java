package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class opp_details {
	WebDriver driver;

	public opp_details(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1761vh7']")
	WebElement companame;

	public WebElement companame() {
		return companame;
	}
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1lid3o9']")
	WebElement editbt;

	public WebElement editbt() {
		return editbt;
	}
	
	@FindBy(xpath = "//button[@aria-label='Assign Opportunity']")
	WebElement assignoppobtn;

	public WebElement assignoppobtn() {
		return assignoppobtn;
	}
	
	@FindBy(xpath = "(//button[@type='button'])[9]")
	WebElement closlostbtn;

	public WebElement closlostbtn() {
		return closlostbtn;
	}

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-f7ngrh']")
	WebElement Yescloslostbtn;

	public WebElement Yescloslostbtn() {
		return Yescloslostbtn;
	}
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1yuz5n9']")
	WebElement NOcloslostbtn;

	public WebElement NOcloslostbtn() {
		return NOcloslostbtn;
	}
	
	@FindBy(xpath = "//div[@id='mui-component-select-lost_reason']")
	WebElement LostreasoremarkDrop;

	public WebElement LostreasoremarkDrop() {
		return LostreasoremarkDrop;
	}
	
	@FindBy(xpath = "//li[@data-value='High Price']")
	WebElement ListHighpri;

	public WebElement ListHighpri() {
		return ListHighpri;
	}
	
	@FindBy(xpath = "//li[@data-value='Proposed Solution not acceptable']")
	WebElement ListProSOlnotAcc;

	public WebElement ListProSOlnotAcc() {
		return ListProSOlnotAcc;
	}
	
	@FindBy(xpath = "//li[@data-value='No Feasibility']")
	WebElement LiNofaesible;

	public WebElement LiNofaesible() {
		return LiNofaesible;
	}
	
	@FindBy(xpath = "//li[@data-value='Not Happy with Company']")
	WebElement LiNotHappWithComp;

	public WebElement LiNotHappWithComp() {
		return LiNotHappWithComp;
	}
	
	@FindBy(xpath = "//li[@data-value='Not Happy with Partner']")
	WebElement LiNotHappWithPartner;

	public WebElement LiNotHappWithPartner() {
		return LiNotHappWithPartner;
	}
	
	@FindBy(xpath = "//li[@data-value='Delay']")
	WebElement LiDelay;

	public WebElement LiDelay() {
		return LiDelay;
	}
	
	@FindBy(xpath = "//li[@data-value='No Activity']")
	WebElement LiNoAct;

	public WebElement LiNoAct() {
		return LiNoAct;
	}
	
	@FindBy(xpath = "//li[@data-value='Others']")
	WebElement LiOther;

	public WebElement LiOther() {
		return LiOther;
	}
	
	@FindBy(xpath = "//textarea[@name='detailreason']")
	WebElement LostReasontext;

	public WebElement LostReasontext() {
		return LostReasontext;
	}
	
	@FindBy(xpath = "(//button[@type='button'])[9]")
	WebElement LostSavebtn;

	public WebElement LostSavebtn() {
		return LostSavebtn;
	}
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-v09jut']")
	WebElement approvebtn;

	public WebElement approvebtn() {
		return approvebtn;
	}
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1p8gihq']")
	WebElement rejectbtn;

	public WebElement rejectbtn() {
		return rejectbtn;
	}
	
	@FindBy(xpath = "//textarea[@aria-label='empty textarea']")
	WebElement rejectremark;

	public WebElement rejectremark() {
		return rejectremark;
	}

	@FindBy(xpath = "//button[@id='validate']")
	WebElement feasiblitysavebtn;

	public WebElement feasiblitysavebtn() {
		return feasiblitysavebtn;
	}
	
	@FindBy(xpath = "//textarea[@placeholder='Please add request remark']")
	WebElement requestremark;

	public WebElement requestremark() {
		return requestremark;
	}
	
	@FindBy(xpath = "//input[@id='fileInput']")
	WebElement fileuploadBtn;

	public WebElement fileuploadBtn() {
		return fileuploadBtn;
	}

	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-dn3mfp']")
	WebElement ulpoadDocandSentforAppr;

	public WebElement ulpoadDocandSentforAppr() {
		return ulpoadDocandSentforAppr;
	}
	
	@FindBy(xpath = "//input[@name='otc']")
	WebElement CommOTC;

	public WebElement CommOTC() {
		return CommOTC;
	}
	
	@FindBy(xpath = "//input[@name='arc']")
	WebElement CommARC;

	public WebElement CommARC() {
		return CommARC;
	}
	@FindBy(xpath = "//div[@id='mui-component-select-months']")
	WebElement selectContractp;

	public WebElement selectContractp() {
		return selectContractp;
	}
	
	@FindBy(xpath = "//li[@data-value='24']")
	WebElement limonth;

	public WebElement limonth() {
		return limonth;
	}
	
	@FindBy(xpath = "//div[@id='mui-component-select-bill_frequency']")
	WebElement selectBillingfreqdrdo;

	public WebElement selectBillingfreqdrdo() {
		return selectBillingfreqdrdo;
	}
	
	@FindBy(xpath = "//li[@data-value='Annually']")
	WebElement liAnnually;

	public WebElement liAnnually() {
		return liAnnually;
	}
	
	@FindBy(xpath = "//div[@id='mui-component-select-billed_by']")
	WebElement selectBilledBY;

	public WebElement selectBilledBY() {
		return selectBilledBY;
	}
	
	@FindBy(xpath = "//li[@data-value='Mobigic']")
	WebElement LiMobigic;

	public WebElement LiMobigic() {
		return LiMobigic;
	}
	
	@FindBy(xpath = "//li[@data-value='Others']")
	WebElement LiOthers;

	public WebElement LiOthers() {
		return LiOthers;
	}

	@FindBy(xpath = "//div[@id='mui-component-select-bill_type']")
	WebElement selectBillingType;

	public WebElement selectBillingType() {
		return selectBillingType;
	}
	
	@FindBy(xpath = "//li[@data-value='Advance']")
	WebElement LiAdvance;

	public WebElement LiAdvance() {
		return LiAdvance;
	}
	
	@FindBy(xpath = "//li[@data-value='Arrears']")
	WebElement LiArrears;

	public WebElement LiArrears() {
		return LiArrears;
	}
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-aibcvr']")
	WebElement commertialSavebtn;

	public WebElement commertialSavebtn() {
		return commertialSavebtn;
	}
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-f37isv']")
	WebElement stagenameTitle;

	public WebElement stagenameTitle() {
		return stagenameTitle;
	}
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-11x6720']")
	WebElement NotaskCreatedYetTitle;

	public WebElement NotaskCreatedYetTitle() {
		return NotaskCreatedYetTitle;
	}
	
	@FindBy(xpath = "//p[@class='MuiTypography-root MuiTypography-body1 css-1fka263']")
	WebElement leadid;

	public WebElement leadid() {
		return leadid;
	}
	
	@FindBy(xpath = "//div[@class='swal-title']")
	WebElement swaltitle;

	public WebElement swaltitle() {
		return swaltitle;

	}
	
	@FindBy(xpath = "//button[@class='swal-button swal-button--confirm']")
	WebElement okswalbtn;

	public WebElement okswalbtn() {
		return okswalbtn;

	}
	
	
	
	
	
}
