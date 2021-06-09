package StepDef;

import static org.junit.Assert.assertTrue;

import Pages.dashboardPage;
import Pages.loginPage;
import Utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_StepDef {
	loginPage lp = new loginPage();
	dashboardPage dp = new dashboardPage();

	@Given("user is at the login page")
	public void user_is_at_the_login_page() {
		assertTrue(lp.loginPanelText.isDisplayed());
	}

	@When("user enters a valid name and password")
	public void user_enters_a_valid_name_and_password() {
		lp.usernameInputBox.sendKeys(ConfigReader.getProperty("username"));
		lp.passwordInputBox.sendKeys(ConfigReader.getProperty("password"));
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		lp.loginBtn.click();
	}

	@Then("user should be able to verify dashboard text")
	public void user_should_be_able_to_verify_dashboard_text() {
		assertTrue(dp.dashboardHeaderText.isDisplayed());
	}
}
