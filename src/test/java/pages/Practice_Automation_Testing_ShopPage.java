package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

import java.util.List;

import static org.junit.Assert.fail;

public class Practice_Automation_Testing_ShopPage {
    By shopButton = By.xpath("//*[@id=\"menu-item-40\"]/a[1]");
    By slider = By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form[1]/div[1]/div[1]/span[2]");
    //By WE450=By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form[1]/div[1]/div[2]/div[1]/span[2]");
    By filterButton = By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form[1]/div[1]/div[2]/button[1]");
    By productPrices = By.xpath("//span[@class='price']");


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
        Thread.sleep(2000);
        Driver.scrollIntoViewJS(productPriceElements.get(0));

        Assert.assertTrue(Driver.getDriver().findElement(productPrices).isDisplayed());

        for (int i = 0; i < productPriceElements.size(); i++) {
            System.out.println("Prices between 150 and 450 rps : ");
            System.out.println(productPriceElements.get(i).getText());
        }
    }
}



