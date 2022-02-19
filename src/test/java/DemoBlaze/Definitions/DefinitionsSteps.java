package DemoBlaze.Definitions;

import org.openqa.selenium.WebDriver;

import DemoBlaze.Paginas.LogInPage;
import DemoBlaze.Paginas.SingUpPage;
import DemoBlaze.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private SingUpPage singUpPage = new SingUpPage(driver);
	private LogInPage logInPage = new LogInPage (driver); 

	@Given("^abrir el navegador$")
	//Metodo
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}
	
	
	@And("^cuando diligencie los campos usuario (.*) y contraseña(.*)$")
	//Metodo
	public void registrarme(String userName, String password) {
		this.singUpPage = new SingUpPage(driver);
		this.singUpPage.registro(userName, password);
	}

	
	@And("^Al diligenciar los campos usuario (.*) y contraseña (.*)$")
	//Metodo
	public void ingresar(String userName, String password) {
		this.logInPage = new LogInPage(driver);
		this.logInPage.ingresar(userName, password);
	}
}