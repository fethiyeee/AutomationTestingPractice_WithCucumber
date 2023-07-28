package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class Practice_Automation_Testing_Homepage {

    By sliders= By.xpath("//div[contains(@class, 'n2-ss-slider-')]");

    By arrivals=By.className("woocommerce-LoopProduct-link");

    By img1=By.xpath("//*[@id=\"text-22-sub_row_1-0-2-0-0\"]/div[1]/ul[1]/li[1]/a[1]/img[1]");

    By addToBasketButton=By.xpath("//*[@id=\"product-160\"]/div[2]/form[1]/button[1]");

    By productAddedMessage=By.xpath("//*[@id=\"content\"]/div[1]");




    public void homepageSliders(){
        int expectedSlidersCount=3;
        List<WebElement> slidersList= Driver.getDriver().findElements(sliders);
        int actualSlidersCount=slidersList.size();
        Assert.assertEquals(expectedSlidersCount,actualSlidersCount);
    }

    public void homepageArrivals(){
        int expectedArrivalsCount=3;
        List<WebElement> arrivalsList= Driver.getDriver().findElements(arrivals);
        int actualArrivalsCount=arrivalsList.size();
        Assert.assertEquals(expectedArrivalsCount,actualArrivalsCount);
    }

    public void clickImg1(){
        Driver.getDriver().findElement(img1).click();
    }

    public void addToBasket(){
        Driver.getDriver().findElement(addToBasketButton).click();
        Assert.assertTrue(Driver.getDriver().findElement(productAddedMessage).isDisplayed());

    }






}
