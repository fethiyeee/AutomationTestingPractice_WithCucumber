package pages;

import org.openqa.selenium.By;
import utilities.Driver;

public class Practice_Automation_Testing_MyAccountPage {


    By myAccountButton = By.xpath("//*[@id=\"menu-item-50\"]/a[1]");

    By usernameArea = By.xpath("//*[@id=\"username\"]");

    By passwordArea = By.xpath("//*[@id=\"password\"]");

    By logInButton = By.xpath("//*[@id=\"customer_login\"]/div[1]/form[1]/p[3]/input[3]");


    public void clickMyAccount() {

        Driver.getDriver().findElement(myAccountButton).click();

    }

    public void enterUsername(String username) {

        Driver.getDriver().findElement(usernameArea).sendKeys(username);

    }

    public void enterPassword(String password) {

        Driver.getDriver().findElement(passwordArea).sendKeys(password);

    }


    public void clickLogIn() {

        Driver.getDriver().findElement(logInButton).click();

    }


}
