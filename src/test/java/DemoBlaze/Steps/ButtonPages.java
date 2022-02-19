package DemoBlaze.Steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
	
	@FindBy(how = How.ID, using = "signin2")
	private WebElement btnSingUp;

	@FindBy(how = How.XPATH, using = "//button[@onclick = 'register()']")
	private WebElement btnRegister;
	
	@FindBy(how = How.XPATH, using = "//a[@data-target='#logInModal']")
	private WebElement btnLogIn;
	
	@FindBy(how = How.XPATH, using = "//button[@onclick='logIn()']")
	private WebElement btnLogIn2;
	
	//Constructor 	
		public ButtonPages(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	//Metodo
		public void btnSingUp() {
			btnSingUp.click();
		}
		
		public void btnRegister() {
			btnRegister.click();
		}
		
		public void btnLogIn() {
			btnLogIn.click();
		}
		
		public void btnLogIn2() {
			btnLogIn2.sendKeys(Keys.ENTER);
		}
}
