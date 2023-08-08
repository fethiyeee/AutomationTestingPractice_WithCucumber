package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Practice_Automation_Testing_MyAccountPage;

public class MyAccountPage_StepDefinition {

    Practice_Automation_Testing_MyAccountPage myAccountPage = new Practice_Automation_Testing_MyAccountPage();

    @When("i click my account button")
    public void iClickMyAccountButton() {

        myAccountPage.clickMyAccount();
    }

    @And("i enter registered username in {string} textbox")
    public void iEnterRegisteredUsernameInTextbox(String username) {
        myAccountPage.enterUsername(username);
    }

    @And("i enter registered password in {string} textbox")
    public void iEnterPasswordInTextbox(String password) {
        myAccountPage.enterPassword(password);
    }

    @When("i click on login button")
    public void iClickOnLoginButton() {

        myAccountPage.clickLogIn();
    }

    @Then("i must successfully login to the web page")
    public void iMustSuccessfullyLoginToTheWebPage() {

        myAccountPage.logInIsSuccessfull();
    }

    @And("i enter invalid username in {string} textbox")
    public void iEnterInvalidUsernameInTextbox(String invalidUsername) {
        myAccountPage.enterUsername(invalidUsername);
    }

    @And("i enter invalid password in {string} textbox")
    public void iEnterInvalidPasswordInTextbox(String invalidPassword) {
        myAccountPage.enterPassword(invalidPassword);
    }


    @Then("i must see error message")
    public void iMustSeeErrorMessage() {
        myAccountPage.logInNotSuccessfull();
    }



}

