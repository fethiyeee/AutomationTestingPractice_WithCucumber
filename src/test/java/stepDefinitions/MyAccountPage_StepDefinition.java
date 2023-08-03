package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Practice_Automation_Testing_MyAccountPage;

public class MyAccountPage_StepDefinition {

    Practice_Automation_Testing_MyAccountPage myAccountPage = new Practice_Automation_Testing_MyAccountPage();

    @When("i click my account button")
    public void iClickMyAccountButton() {

        myAccountPage.clickMyAccount();
    }

    @When("i enter registered username in username textbox")
    public void iEnterRegisteredUsernameInUsernameTextbox() {

        myAccountPage.enterUsername("fethiye@gmail.com");
    }

    @When("i enter password in password textbox")
    public void iEnterPasswordInPasswordTextbox() {

        myAccountPage.enterPassword("fethiye2344");
    }

    @When("i click on login button")
    public void iClickOnLoginButton() {

        myAccountPage.clickLogIn();
    }

    @Then("i must successfully login to the web page")
    public void iMustSuccessfullyLoginToTheWebPage() {

        myAccountPage.logInIsSuccessfull();
    }

}
