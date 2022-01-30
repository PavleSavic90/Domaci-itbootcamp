package POMtest;

import POMbase.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POMtest extends BasePage {

    @BeforeMethod
    public void SetUpPage(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void homePageTest(){
        String exceptedUrl = "https://www.saucedemo.com/";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(exceptedUrl,actualURL);
    }
    @Test
    public void laksjdlaksjd () throws InterruptedException {
        Thread.sleep(1000);
        loginPage.inputCorrectPassword();
        loginPage.inputCorrectuUsername();
        loginPage.getLoginButton().click();


        String exceptedUrl = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(exceptedUrl,actualURL);

    }
//    @Test
////    public void pokusajSifre4 (){
////
//    }
}
