package jenkinsMavenIntDemoTest;

import io.cucumber.java.en.*;

public class StepDefinition {
	
	@Given("For Demo purpose")
	public void for_demo_purpose() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("inside given");
	}

	@When("Show integration")
	public void show_integration() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("inside when");
	}

	@Then("Between Jenkins and Git")
	public void between_jenkins_and_git() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("inside then");
	}


}
