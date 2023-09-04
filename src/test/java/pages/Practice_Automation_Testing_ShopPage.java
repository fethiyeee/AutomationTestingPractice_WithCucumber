package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;
import java.util.Random;

public class Practice_Automation_Testing_ShopPage {
    By dismissButton = By.xpath("//div[@id='dismiss-button']");
    By shopButton = By.xpath("//*[@id=\"menu-item-40\"]/a[1]");
    By slider = By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form[1]/div[1]/div[1]/span[2]");
    By filterButton = By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form[1]/div[1]/div[2]/button[1]");
    By productPrices = By.xpath("//span[@class='price']");
    By products = By.xpath("//a[@class='woocommerce-LoopProduct-link']");
    By productName = By.xpath("//h1");
    By productParticular = By.xpath("//div[@class='summary entry-summary']");
    By defaultSorting = By.xpath("//*[@id=\"content\"]/form[1]/select[1]");


    public void clickShopButton() {
        Driver.getDriver().findElement(shopButton).click();
    }

    public void sliderNavigateto450() {
        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDropBy(Driver.getDriver().findElement(slider), -28, 0).build().perform();
    }

    public void clickFilterButton() {
        Driver.getDriver().findElement(filterButton).click();
    }

    public void adjustFilter() throws InterruptedException {
        List<WebElement> productPriceElements = Driver.getDriver().findElements(productPrices);

        Driver.scrollDownByJS();
        Driver.waitForVisibility(productPrices, 1000);
        Driver.scrollIntoViewJS(productPriceElements.get(0));

        Assert.assertTrue(Driver.getDriver().findElement(productPrices).isDisplayed());

        for (int i = 0; i < productPriceElements.size(); i++) {
            System.out.println("Prices between 150 and 450 rps : ");
            System.out.println(productPriceElements.get(i).getText());
        }
    }

    public void clickProductRandom() {
        List<WebElement> productList = Driver.getDriver().findElements(products);
        if (!productList.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(productList.size());
            WebElement randomElement = productList.get(randomIndex);
            Driver.waitForClickablility(randomElement, 3000);
            randomElement.click();
        } else {
            System.out.println("product not found..");
        }

    }

    public void productParticularIsVisible() {
        Assert.assertTrue(Driver.getDriver().findElement(productParticular).getText().contains(Driver.getDriver().findElement(productName).getText()));
    }

    public void clickDefaultSorting() {
        Driver.getDriver().findElement(defaultSorting).click();
    }

    public void sortByPopularity() {
        Select select = new Select(Driver.getDriver().findElement(defaultSorting));
        select.selectByValue("popularity");
        Assert.assertTrue(Driver.getDriver().getTitle().contains("popularity"));
    }
}



