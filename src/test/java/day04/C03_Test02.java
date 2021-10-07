package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class C03_Test02 {

    public static void main(String[] args) {
        //1-Test01 isimli bir class olusturun
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //        1. http://zero.webappsecurity.com sayfasina gidin

        driver.get("http://zero.webappsecurity.com/");
//        2. Signin buttonuna tiklayin
//        3. Login alanine  “username” yazdirin
//        4. Password alanine “password” yazdirin
//        5. Sign in buttonuna tiklayin
//        6. Pay Bills sayfasina gidin
//        7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
//        8. tarih kismina “2020-09-10” yazdirin
//        9. Pay buttonuna tiklayin
//        10. “The payment was successfully submitted.” mesajinin ciktigini control edin
    }

}
