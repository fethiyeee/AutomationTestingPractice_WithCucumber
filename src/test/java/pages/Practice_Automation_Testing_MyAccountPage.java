package pages;

import org.openqa.selenium.By;
import utilities.Driver;

public class Practice_Automation_Testing_MyAccountPage {



    By usernameArea=By.xpath("//*[@id=\"username\"]");

    By passwordArea=By.xpath("//*[@id=\"password\"]");

    By logInButton=By.xpath("//*[@id=\"customer_login\"]/div[1]/form[1]/p[3]/input[3]");


    public void enterUsername(String username){

        Driver.getDriver().findElement(usernameArea).sendKeys(username);

    }

    public void enterPassword(String password){

        Driver.getDriver().findElement(passwordArea).sendKeys(password);

    }


    public void clickLogIn(){

        Driver.getDriver().findElement(logInButton).click();

    }


}
