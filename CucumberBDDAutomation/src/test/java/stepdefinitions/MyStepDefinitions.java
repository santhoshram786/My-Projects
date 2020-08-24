package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

	@Given("^User is in landing Page$")
	public void user_is_in_landing_page() throws Throwable {
		System.out.println("Landing Page");
	}

	@When("^User enterd into application with user credentials$")
	public void user_enterd_into_application_with_user_credentials() throws Throwable {
		System.out.println("User Credentials");
	}

	@When("^User enterd into application with user credentials Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enterd_into_application_with_user_credentials_username_something_and_password_something(
			String user, String pw) throws Throwable {
		System.out.println("User::" + user);
		System.out.println("Password::" + pw);
	}

	@Then("^Home Page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Home Page");
	}

	@And("^Contacts are Displayed$")
	public void contacts_are_displayed() throws Throwable {
		System.out.println("Contacts");
	}

	@Then("^Contacts are Displayed \"([^\"]*)\"$")
	public void contacts_are_Displayed(String get) throws Exception {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(get);
	}
}
