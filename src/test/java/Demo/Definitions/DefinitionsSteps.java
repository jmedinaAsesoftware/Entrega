package Demo.Definitions;

import org.openqa.selenium.WebDriver;

import Demo.Pages.LogInPage;
import Demo.Pages.SignUpPage;
import Demo.Steps.Conecction;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conecction conexion = new Conecction();
	private SignUpPage signUpPage = new SignUpPage(driver);
	private LogInPage logInPage = new LogInPage(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conecction();
		this.driver = this.conexion.abrirNavegador();

	}

	@And("^Fill out user name (.*) and password (.*)$")
	public void fillOutSing(String userNameP, String passwordP) {
		this.signUpPage = new SignUpPage(driver);
		this.signUpPage.fillOutSingM(userNameP, passwordP);

	}
	
	@When("^Fill out Login user name (.*) and password (.*)$")
	public void fillOutLogInM(String userNameP, String passwordP) {
		this.logInPage = new LogInPage(driver);
		this.logInPage.fillOutLogInM(userNameP, passwordP);
	}

}