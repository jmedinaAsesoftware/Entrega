package Demo.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
	
	private WebDriver driver;
	
	@FindBy(how = How.ID, using = "signin2")
	private WebElement btnSingUp;
	
	@FindBy(how = How.XPATH, using = "//button[@onclick = 'register()']")
	private WebElement btnRegister;
	
	@FindBy(how = How.XPATH, using = "//a[@data-target = '#logInModal']")
	private WebElement btnLogIn;
	
	@FindBy(how = How.XPATH, using = "//button[@onclick = 'logIn()']")
	private WebElement btnLogin;
	
	public ButtonPages (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	
	public void btnSingUp() {
		btnSingUp.click();
	}
	
	public void btnRegister() {
		btnRegister.isDisplayed();
		btnRegister.click();
	}
	
	public void btnLogIn() {
		btnLogIn.isDisplayed();
		btnLogIn.click();
	}

	public void btnLogin() {
		btnLogin.isDisplayed();
		btnLogin.click();
	}
}
