package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Selenium10 {
    public static void main(String[] args) throws InterruptedException, AWTException {



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.youtube.com");
        WebElement search = driver.findElement(By.className("ytd-searchbox-spt"));
        search.click();


        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_E);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_N);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(1500);
        WebElement klikniVideo = driver.findElement(By.cssSelector("#video-title > yt-formatted-string"));
        klikniVideo.click();


        String sajt1 = driver.getCurrentUrl();
        String exceptedURL = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
        Assert.assertEquals(sajt1,exceptedURL);
    }
}
