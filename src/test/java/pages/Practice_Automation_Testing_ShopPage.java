package pages;

import org.openqa.selenium.By;
import utilities.Driver;

public class Practice_Automation_Testing_ShopPage {
    By shopButton= By.xpath("//*[@id=\"menu-item-40\"]/a[1]");



    public void clickShopButton(){
        Driver.getDriver().findElement(shopButton).click();
    }
}
