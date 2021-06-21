package Demo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Demo.Steps.ButtonPages;
import net.thucydides.core.annotations.Step;

public class LogInPage {
	
	private WebDriver driver;
	private ButtonPages buttonPages = new ButtonPages(driver);
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'loginusername']")
	private WebElement inputUserName;
	
	@FindBy(how = How.XPATH, using = "//input[@id = 'loginpassword']")
	private WebElement inputPassword ;
	
	
	public LogInPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.buttonPages = new ButtonPages(driver);
		
		
	}
	
	@Step
	public void fillOutLogInM(String userNameP,String passwordP) {
		buttonPages.btnLogIn();
		inputUserName.sendKeys(userNameP);
		inputPassword.sendKeys(passwordP);
		buttonPages.btnLogin();
	}

}
