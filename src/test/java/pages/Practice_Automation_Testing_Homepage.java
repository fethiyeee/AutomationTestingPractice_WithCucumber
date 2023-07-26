package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class Practice_Automation_Testing_Homepage {

    By sliders= By.xpath("//div[contains(@class, 'n2-ss-slider-')]");

    By arrivals=By.className("woocommerce-LoopProduct-link");




    public void homepageSliders(){
        int expectedSlidersCount=3;
        List<WebElement> slidersList= Driver.getDriver().findElements(sliders);
        int actualSlidersCount=slidersList.size();
        Assert.assertEquals(expectedSlidersCount,actualSlidersCount);
    }

    public void homepageArrivals(){
        int expectedArrivalsCount=3;
        List<WebElement> sliderList= Driver.getDriver().findElements(arrivals);
        int actualArrivalsCount=sliderList.size();
        Assert.assertEquals(expectedArrivalsCount,actualArrivalsCount);
    }





}
