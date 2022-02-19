package DemoBlaze.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import DemoBlaze.Steps.ButtonPages;

public class SingUpPage {
	
	@FindBy(how = How.ID, using = "sign-username")
	private WebElement txtUserName;
	
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	private WebElement txtPassword;
	
	private ButtonPages buttonPages;
	
	// Constructor
	public SingUpPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);
	}

	// Metodo
	public void registro (String userName, String password) {
		buttonPages.btnSingUp();
		txtUserName.isDisplayed();
		txtUserName.sendKeys(userName);
		txtPassword.sendKeys(password);
		buttonPages.btnRegister();
	}
	
	
}