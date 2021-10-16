package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Mail {
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
    public void mailSingIn() throws InterruptedException {

        WebElement signIn=driver.findElement(By.xpath("//a[@class='_yb_kwvjz']"));
        signIn.click();
        WebElement userName=driver.findElement(By.id("login-username"));
        userName.sendKeys("onerdogan91@yahoo.com"+ Keys.ENTER);
        WebElement passWord=driver.findElement(By.id("login-passwd"));
        passWord.sendKeys("od233777"+Keys.ENTER);
        WebElement mailPage=driver.findElement(By.xpath("//a[@class='_yb_378tc']"));
        mailPage.click();
        Thread.sleep(1000);
           WebElement logo = driver.findElement(By.xpath("//img[@class='_yb_1g1z2 _yb_189lq _yb_1b4qp']"));
          Assert.assertTrue("Logo gorunmuyor", logo.isDisplayed());
    }
    @Test
    public void inDateSend(){
        LocalDate today = LocalDate.now();
        List<String> dateList=new ArrayList();
        dateList.add("2021-10-11");
        dateList.add("2021-10-12");
        dateList.add("2021-10-13");
        dateList.add("2021-10-15");

        List<String> emailList=new ArrayList();
        emailList.add("onerdogan91@gmail.com");
        emailList.add("onerdogan91@gmail.com");
        emailList.add("onerdogan91@gmail.com");
        for (int i=0;i<dateList.size();i++){

            Assert.assertEquals("bugun dogumtarihi olan yok",dateList.get(i),today);
            WebElement compose=driver.findElement(By.xpath("//a[@data-test-id='compose-button']"));
            compose.click();
            WebElement goTo=driver.findElement(By.xpath("//input[@id='message-to-field']"));
            goTo.sendKeys(emailList.get(i));
        }

    }
    @Test
    public void mailSend() throws InterruptedException {

        WebElement subject=driver.findElement(By.xpath("//input[@data-test-id='compose-subject']"));
        subject.sendKeys("hadi bakaliiiim");
        Thread.sleep(1000);
        WebElement gif=driver.findElement(By.xpath("//button[@data-test-id='stationery-button']"));
        gif.click();
        Thread.sleep(1000);
        WebElement birthday=driver.findElement(By.xpath("//li[@title='Birthday']"));
        birthday.click();
        Thread.sleep(1000);
        WebElement img2=driver.findElement(By.xpath("(//img[@class='D_B W_3mS2U H_3n93F'])[2]"));
        img2.click();
        Thread.sleep(1000);
        WebElement sendButton=driver.findElement(By.xpath("//button[@data-test-id='compose-send-button']"));
     //   sendButton.click();
    }
}






//static LocalDate today = LocalDate.now();
//today
//List<String>cinsiyetListesi=new ArrayList();
//	List<String>tevellutListesi=new ArrayList();
//String expectedTitle = "YouTube";
 //   String actualTitle = driver.getTitle();
   //     Assert.assertEquals("Sayfa title'i beklenenden farkli", expectedTitle, actualTitle);