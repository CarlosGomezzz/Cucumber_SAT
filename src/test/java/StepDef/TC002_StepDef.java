package StepDef;

import static org.junit.Assert.assertTrue;

import Pages.loginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC002_StepDef {
	loginPage lp = new loginPage();

	@When("user enters {string} and {string} and click login")
	public void user_enters_and_and_click_login(String username, String password) {
		lp.usernameInputBox.sendKeys(username);
		lp.passwordInputBox.sendKeys(password);
		lp.loginBtn.click();
	}

	@Then("user should be able to verify invalid text")
	public void user_should_be_able_to_verify_invalid_text() {
		assertTrue(lp.invalidCredentialsError.isDisplayed());
	}
}
