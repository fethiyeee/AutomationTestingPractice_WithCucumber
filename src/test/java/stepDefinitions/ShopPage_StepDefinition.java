package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Practice_Automation_Testing_ShopPage;
import utilities.Driver;


public class ShopPage_StepDefinition {
    Practice_Automation_Testing_ShopPage shopPage = new Practice_Automation_Testing_ShopPage();

    @When("i click shop button")
    public void i_click_shop_button() {

        shopPage.clickShopButton();

    }

    @And("i can adjust the filter by price between 150 to 450 rps")
    public void iCanAdjustTheFilterByPriceBetweenToRps() throws InterruptedException {
        shopPage.sliderNavigateto450();
        Thread.sleep(3000);
    }


    @And("i click on Filter button")
    public void iClickOnFilterButton() {

        shopPage.clickFilterButton();

    }

    @And("i can see books only between 150 to 450 rps price")
    public void iCanSeeBooksOnlyBetweenToRpsPrice() throws InterruptedException {
        shopPage.adjustFilter();
    }

    @When("i click any of the product links available in the product category")
    public void iClickAnyOfTheProductLinksAvailableInTheProductCategory() {
        shopPage.clickProductRandom();
    }

    @Then("i can see only that particular product")
    public void iCanViewOnlyThatParticularProduct() {
        shopPage.productParticularIsVisible();
    }

    @When("i click on Sort by Popularity item in Default sorting dropdown")
    public void iClickOnSortByPopularityItemInDefaultSortingDropdown() {
        
    }

    @Then("i can see the popular products only")
    public void iCanSeeThePopularProductsOnly() {
    }
}
