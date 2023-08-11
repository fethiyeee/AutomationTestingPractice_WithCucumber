package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.Practice_Automation_Testing_ShopPage;

public class ShopPage_StepDefinition {
    Practice_Automation_Testing_ShopPage shopPage=new Practice_Automation_Testing_ShopPage();

    @When("i click shop button")
    public void i_click_shop_button() {

        shopPage.clickShopButton();

    }

    @And("i can adjust the filter by price between {string} to {string} rps")
    public void iCanAdjustTheFilterByPriceBetweenToRps(String arg0, String arg1) {

    }

    @And("i click on Filter button")
    public void iClickOnFilterButton() {

        shopPage.clickFilterButton();

    }

    @And("i can see books only between {string} to {string} rps price")
    public void iCanSeeBooksOnlyBetweenToRpsPrice(String arg0, String arg1) {
    }

}
