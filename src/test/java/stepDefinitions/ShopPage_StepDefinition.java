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
    @And("i can adjust the filter by price between {int} to {int} rps")
    public void iCanAdjustTheFilterByPriceBetweenToRps(int arg0, int arg1) {
        shopPage.sliderNavigateto450();
    }

    @And("i click on Filter button")
    public void iClickOnFilterButton() {

        shopPage.clickFilterButton();

    }

    @And("i can see books only between {int} to {int} rps price")
    public void iCanSeeBooksOnlyBetweenToRpsPrice(int arg0, int arg1) {
    }
}
