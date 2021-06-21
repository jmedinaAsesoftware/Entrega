package Demo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Demo.Steps.ButtonPages;
import net.thucydides.core.annotations.Step;

public class SignUpPage {
	
	private WebDriver driver;
	private ButtonPages buttonPages = new ButtonPages(driver);
	
	
	@FindBy(how = How.ID, using = "sign-username")
	private WebElement inputUserName;
	
	@FindBy(how = How.XPATH, using = "//input[@type = 'password']")
	private WebElement inputPassword;
	
	public SignUpPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.buttonPages = new ButtonPages(driver);
	}
	
	@Step
	public void fillOutSingM(String userNameP, String passwordP) {
		buttonPages.btnSingUp();
		inputUserName.sendKeys(userNameP);
		inputPassword.sendKeys(passwordP);
		buttonPages.btnRegister();
	}

}
