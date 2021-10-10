package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Calisma {


        static WebDriver driver;
        @BeforeClass
        public static void setup() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("http://www.hotmail.com");
           WebElement signInTikla= driver.findElement(By.xpath("(//*[@class=\"internal sign-in-link\"])[2]"));
           signInTikla.click();
           WebElement emailAdresi= driver.findElement(By.xpath("//input[@type='email']"));
           emailAdresi.sendKeys("onerdogan99@hotmail.com"+Keys.ENTER);
            Thread.sleep(1000);
            WebElement passworGir=driver.findElement(By.xpath("//input[@name='passwd']"));
            passworGir.sendKeys("od233777"+Keys.ENTER);
            driver.findElement(By.id("idBtn_Back")).click();
        }
        @Test
        public void yeniIleti() {
            driver.findElement(By.xpath("//span[@class='ms-Button-label uHWG8PYRNYDO2895_TmUG label-57']")).click();
            WebElement kimeGidecek=driver.findElement(By.xpath("//input[@class='ms-BasePicker-input pickerInput_fe42fc7e']"));
            kimeGidecek.sendKeys("onerdogan91@gmail.com");
            WebElement konuYaz=driver.findElement(By.xpath("//input[@class='ms-TextField-field field-180']"));
            konuYaz.sendKeys("vay beee");
            WebElement icerikDoldur=driver.findElement(By.xpath("//div[@style='font-family: Calibri, Helvetica, sans-serif; font-size: 12pt; color: rgb(0, 0, 0);']"));
            icerikDoldur.sendKeys("NICE MUTLU YILLARA"+ "C:\\Users\\Öner\\Pictures\\Feedback\\{A88CA873-A995-4D7A-93CF-4D496833F691}");
            WebElement gonderButonu=driver.findElement(By.id("id__417"));
            // gonderButonu.click();
        }
        @AfterClass
        public static void tearDown(){
           // driver.close();
        }
    }

