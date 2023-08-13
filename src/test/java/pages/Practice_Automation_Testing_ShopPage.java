package pages;

import org.openqa.selenium.By;
import utilities.Driver;

public class Practice_Automation_Testing_ShopPage {
    By shopButton= By.xpath("//*[@id=\"menu-item-40\"]/a[1]");

    By filterButton=By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form[1]/div[1]/div[2]/button[1]");



    public void clickShopButton(){
        Driver.getDriver().findElement(shopButton).click();
    }

    public void clickFilterButton(){ Driver.getDriver().findElement(filterButton).click();}

    public void adjustFilter(){

    }
}
