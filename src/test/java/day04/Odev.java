package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class Odev {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        Mehmet Bulutluoz  11:23 PM
//        1. “https://www.saucedemo.com” Adresine gidin
        driver.navigate().to("https://www.saucedemo.com");
//        2. Username kutusuna “standard_user” yazdirin
        driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("standard_user");
//        3. Password kutusuna “secret_sauce” yazdirin
        driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys("secret_sauce");

//        4. Login tusuna basin
        driver.findElement(By.xpath("//input[@type='submit']")).click();
//        5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement urunAdi=driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]"));
        System.out.println(urunAdi.getText());
        driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).click();
//        6. Add to Cart butonuna basin
        driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();
//        7. Alisveris sepetine tiklayin
        driver.findElement(By.className("shopping_cart_badge")).click();
//        8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement urunDogrumu=driver.findElement(By.xpath("//*[(text()='Sauce Labs Backpack')]"));
        System.out.println(urunDogrumu.isDisplayed());
//        9. Sayfayi kapatin
        driver.close();

    }
}
