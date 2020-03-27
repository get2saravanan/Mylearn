import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trial {
    public static void main(String args[]) throws InterruptedException {
        // 1st step is to set property ie to open

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\SeleniumDriver\\chromedriver.exe");

        // call chrome  exe to openbrowser
        WebDriver driver = new ChromeDriver();

        // In the browser launch a web site
        driver.get("https://authvchnform.cognizant.com/vpn/tmindex.html");

        Thread.sleep(5000);
        driver.findElement(By.id("username")).sendKeys("437972");

        driver.findElement(By.id("PasswordInternal")).sendKeys("saranCBE5$");
        Thread.sleep(5000);

        driver.findElement(By.id("Log_On1")).click();

        Thread.sleep(10000);

        driver.findElement(By.id("txtPlatformBarSearch")).sendKeys("Mypay");

        driver.findElement(By.id("btnsearch")).click();




    }
}
