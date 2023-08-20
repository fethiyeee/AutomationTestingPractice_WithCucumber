package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class Practice_Automation_Testing_ShopPage {
    By shopButton= By.xpath("//*[@id=\"menu-item-40\"]/a[1]");
    By slider=By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form[1]/div[1]/div[1]/span[2]");
    By WE450=By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form[1]/div[1]/div[2]/div[1]/span[2]");
    By filterButton=By.xpath("//*[@id=\"woocommerce_price_filter-2\"]/form[1]/div[1]/div[2]/button[1]");



    public void clickShopButton(){
        Driver.getDriver().findElement(shopButton).click();
    }

    public void sliderNavigateto450(int targetPrice){
        int sliderWidth = Driver.getDriver().findElement(slider).getSize().getWidth();
        int totalRange = 450 - 150;

        // Belirli fiyat aralığındaki oranı hesaplayın
        double ratio = (targetPrice - 150) / (double) totalRange;

        // Slider üzerine tıklayarak belirli fiyat aralığına git
        int targetX = (int) (sliderWidth * ratio);

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(slider), targetX, 0).click().perform();

    }

    public void clickFilterButton(){ Driver.getDriver().findElement(filterButton).click();}

    public void adjustFilter(){

    }
}
