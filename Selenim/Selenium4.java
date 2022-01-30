package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/");



        Cookie kolacic = new Cookie("userID", "baec536b-81e3-4621-a453-93722e26d848");
        driver.manage().addCookie(kolacic);
        Cookie kolacic1 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InN0cmFob3IiLCJwYXNzd29yZCI6IlF3ZXJ0eTEyMyQiLCJpYXQiOjE2NDIxOTA1MTd9.LyqVI9SNI_9uSRvXRn_QubntLEs_zfSs7uAIiUZxQWQ");
        driver.manage().addCookie(kolacic1);
        Cookie kolacic2 = new Cookie("userName", "strahor");
        driver.manage().addCookie(kolacic2);
        Cookie kolacic3 = new Cookie("expires", "2022-01-21T20%3A01%3A57.241Z");
        driver.manage().addCookie(kolacic3);
        driver.manage();
        driver.navigate().to("https://demoqa.com/profile");
        


        //ITS ALIVE
    }
}



//Cookie kolacic = new Cookie("naziv kolacica", "vrednost kolacica");
//        driver.manage().addCookie(kolacic);
//        driver.navigate().refresh();