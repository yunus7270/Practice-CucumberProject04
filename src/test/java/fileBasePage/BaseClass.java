package fileBasePage;

import org.junit.runner.RunWith;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

public class BaseClass {
	
	@Given("visiting homepage of {string} website")
	public void visiting_homepage_of_website(String string) {
		System.out.println("Webpage is displayed");
	}
	
	
	@When("entering credentials {string} and {string} to log in")
	public void entering_credentials_and_to_log_in(String string, String string2) {
		System.out.println("Username " + string);
		System.out.println("Password " + string2);
	
	}
	@Then("read the {string} from console")
	public void read_the_from_console(String string) {
		System.out.println("Message: " + string);
	
	}
	
	@Then("verify the message {string}")
	public void verify_the_message(String string) {
	 
	}

	

}
