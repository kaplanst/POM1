import Menu.OptomIzKitaya;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    WebDriver driver;
    OptomIzKitaya optomIzKitaya;

    @BeforeMethod
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://vkitae.kz/");
    }
    @AfterMethod
    public void Bye(){
        driver.quit();
    }

    @Test
    public void optomIzKitayaTest(){
        driver.findElement(By.xpath("//a[@href='https://vkitae.kz/tovary-optom-iz-kitaya']")).click();
        optomIzKitaya = MainPage.optomClick();
    }
}
