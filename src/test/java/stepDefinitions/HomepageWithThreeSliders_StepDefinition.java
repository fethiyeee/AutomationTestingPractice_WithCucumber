package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Practice_Automation_Testing_Homepage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class HomepageWithThreeSliders_StepDefinition {

    Practice_Automation_Testing_Homepage homepage=new Practice_Automation_Testing_Homepage();

    @Given("i am on the homepage")
    public void i_am_on_the_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("practicePage"));

    }

    @Then("i should see at least three sliders")
    public void i_should_see_at_least_three_sliders() {

        homepage.homepageSliders();

    }

    @Then("i should see at least three arrivals")
    public void iShouldSeeAtLeastThreeArrivals() {

        homepage.homepageArrivals();

    }

    @When("i click the image in the Arrivals")
    public void iClickTheImageInTheArrivals() {
        homepage.clickImg1();
    }


    @Then("i can add that book into the basket")
    public void iCanAddThatBookIntoTheBasket() {

        homepage.addToBasket();
    }


    @Then("i can see a description regarding that book")
    public void iCanSeeADescriptionRegardingThatBook() {

    }
}
