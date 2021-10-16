package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BirthdayCart {

    static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http:www.yahoo.com");

    }
    @Test
    public void mailSingIn(){
        WebElement mailBtn=driver.findElement(By.xpath("//span[@class='ybar-icon-sprite _yb_wr285 _yb_14bur']"));
        mailBtn.click();
        WebElement signInBtn=driver.findElement(By.xpath("//a[@alt='Sign in']"));
        signInBtn.click();
        WebElement userName=driver.findElement(By.id("login-username"));
        userName.sendKeys("onerdogan91@gmail.com"+ Keys.ENTER);

    }
}