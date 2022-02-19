package DemoBlaze.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import DemoBlaze.Steps.ButtonPages;
import DemoBlaze.Steps.Questions;

public class LogInPage {
	
	private ButtonPages buttonPages;
	private Questions questions;
	
	@FindBy(how = How.ID, using = "loginusername")
	private WebElement txtUserName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='loginpassword']")
	private WebElement txtPassword;
	
	// esto es un constructor
	public LogInPage (WebDriver driver) {
			PageFactory.initElements(driver, this);
			this.buttonPages = new ButtonPages(driver);
			this.questions = new Questions(driver);
	}
	
	//esto es un metodo
	public void ingresar (String userName, String password) {
		buttonPages.btnLogIn();
		txtUserName.sendKeys(userName);
		txtPassword.sendKeys(password);
		questions.screenShot();
		buttonPages.btnLogIn2();
	}

}
