package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class Practice_Automation_Testing_Homepage {

    By sliders= By.xpath("//div[contains(@class, 'n2-ss-slider-')]");




    public void homepageSliders(){
        int expectedSliderCount=3;
        List<WebElement> sliderList= Driver.getDriver().findElements(sliders);
        int actualSliderCount=sliderList.size();
        Assert.assertEquals(expectedSliderCount,actualSliderCount);
    }





}
