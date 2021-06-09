package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Driver;

public class loginPage {
	public loginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "logInPanelHeading")
	public WebElement loginPanelText;

	@FindBy(id = "txtUsername")
	public WebElement usernameInputBox;

	@FindBy(id = "txtPassword")
	public WebElement passwordInputBox;

	@FindBy(id = "btnLogin")
	public WebElement loginBtn;

	@FindBy(id = "spanMessage")
	public WebElement invalidCredentialsError;
}
