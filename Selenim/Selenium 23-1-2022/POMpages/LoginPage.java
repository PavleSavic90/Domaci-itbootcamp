package POMpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    WebElement username;
    WebElement password;
    WebElement loginButton;
    WebElement errorMessageText;



    public LoginPage(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getUsername() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPassword() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }

    public WebElement getErrorMessageText() {
        return driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"));
    }


    public String praviHardcodedUsername (){
        String a = "standard_user";
        return a;
    }
    public String praviHardcodedPassword (){
        String a = "secret_sauce";
        return a;
    }
    public void inputCorrectPassword(){
        getPassword().sendKeys(praviHardcodedPassword());
    }
    public void inputCorrectuUsername(){
        getUsername().sendKeys(praviHardcodedUsername());
    }
    public WebElement uzmiPassword(){
        return driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/text()"));
    }
}
