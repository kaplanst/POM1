import Menu.OptomIzKitaya;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

import java.util.concurrent.TimeUnit;

public class MainPage {
    static WebDriver driver;
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://vkitae.kz/");
   //     WebElement optomLink = driver.findElement(By.xpath("//a[@href='https://vkitae.kz/tovary-optom-iz-kitaya']"));

        optomClick();
    }


 //   @FindBy(xpath = "//a[@href='https://vkitae.kz/tovary-optom-iz-kitaya']")
 //   public static WebElement optomLink = driver.findElement(By.xpath("//a[@href='https://vkitae.kz/tovary-optom-iz-kitaya']"));

     @FindBy(xpath = "//a[@href='https://vkitae.kz/dostavka']")
     public static WebElement dostavka;

     @FindBy(xpath = "//a[@href='https://vkitae.kz/oplata']")
     public static WebElement oplata;



    public static OptomIzKitaya optomClick() {
     //   driver.findElement(By.xpath("//a[@href='https://vkitae.kz/tovary-optom-iz-kitaya']")).click();
        return new OptomIzKitaya();
    }


}