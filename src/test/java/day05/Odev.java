package day05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Odev {

    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void amazonTesti(){
        driver.get("https://www.amazon.com");
  //      4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
       // 5- Sayfa basliginin “Amazon” ifadesi icerdigini control edin
        String actualTitle=driver.getTitle();
        String arananKelime="Amazon";
        if(actualTitle.contains(arananKelime)) {
            System.out.println("test PASS: "+driver.getTitle());
        }
        //6-Sayfa basliginin “Amazon.com. Spend less. Smile more.” a esit oldugunu control ediniz
        String expectedTitle="Amazon.com. Spend less. Smile more.";
        if(expectedTitle.equals(actualTitle)){
            System.out.println("test PASS");
        }else {
            System.out.println("ayni degil");
            System.out.println("dogru title; "+actualTitle);
        }
        //7- URL in amazon.com icerdigini control edin
        String actualURL=driver.getCurrentUrl();
        String arananURL="amazon.com";
        if(actualURL.contains(arananURL)){
            System.out.println("URL de aranan ifade mevcut: PASS");
        }else {
            System.out.println("URL de ifde yok FAILED; dogrusu: "+actualURL);
        }
        //        8-”Nutella” icin arama yapiniz

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella"+ Keys.ENTER);


       // 9- Kac sonuc bulundugunu yaziniz

       WebElement sonuclar=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonuclar.getText());
    }

    @After
    public void tearDown(){
        driver.close();
    }


}
