package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class E_card {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        Mehmet Bulutluoz  11:23 PM
//        1. “https://www.saucedemo.com” Adresine gidin
        driver.navigate().to("https://www.google.com");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("e-kart tebrik"+ Keys.ENTER);
        driver.findElement(By.linkText("Images")).click();
        driver.findElement(By.xpath("(//img[@data-ils='4'])[64]")).click();
    }
}
