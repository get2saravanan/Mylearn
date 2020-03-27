//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import sun.tools.tree.NewArrayExpression;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Natwestappauto {

    public static void main(String args[]) throws InterruptedException, AWTException {

       // System.setProperty("WebDriver.Chrome.driver", "C:\\Drivers\\SeleniumDriver\\chromedriver.exe");

        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\SeleniumDriver\\chromedriver.exe");

        WebDriver driver  = new ChromeDriver();

        driver.get("https://personal.natwest.com/personal.html");

        driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/a")).click();

        driver.findElement(By.xpath("/html/body/div[1]/footer/div[1]/div/ul/li[2]/a/span[2]")).click();

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"initial-type-selection\"]/div[5]/label")).click();

        Thread.sleep(5000);


        driver.findElement(By.id("search-input")).sendKeys("london");

        Thread.sleep(5000);

        driver.findElement(By.id("search-button")).click();

        Thread.sleep(5000);


        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/div/div[2]/div[3]/div/a")).click();

        Thread.sleep(5000);

        driver.findElement(By.className("chevron-click")).click();

       driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("support");

      // driver.findElement(By.xpath("//*[@id=\"GSAhiddenparameters\"]/button/img")).click();

       // Function to handle keypad activities. Press enter key

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
