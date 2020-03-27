import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class WebTours {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\SeleniumDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:1080/WebTours/");

        Thread.sleep(5000);
        // driver.switchTo().frame(driver.findElement(By.name("header")));
        driver.switchTo().frame(driver.findElement(By.name("body")));
        driver.switchTo().frame(driver.findElement(By.name("navbar")));

        driver.findElement(By.name("username")).sendKeys("saran");

        driver.findElement(By.name("password")).sendKeys("saran");

        Thread.sleep(5000);

        driver.findElement(By.name("login")).click();


        driver.switchTo().frame(driver.findElement(By.name("body")));
        driver.switchTo().frame(driver.findElement(By.name("navbar")));

        driver.findElement(By.xpath("/html/body/center/center/a[1]/img")).click();

        Thread.sleep(5000);


       // driver.switchTo().frame(driver.findElement(By.name("info")));

        //  **** Drop down value choosing

        //driver.findElement(By.name("depart")).sendKeys("London");

        //driver.findElement(By.xpath("/html/body/blockquote/form/table/tbody/tr[1]/td[2]/select"));

        Select drpdepart = new Select(driver.findElement(By.name("depart")));
        drpdepart.selectByVisibleText("London");


        Thread.sleep(10000);




        // ISelect dropdown;
        // dropdown.selectByVisibleText("London");

        //(new Actions(driver)).dragAndDrop(depart,London).perform();


        Thread.sleep(2000);

       // driver.findElement(By.name("arrive")).sendKeys("Paris");

        driver.findElement(By.name("arrive"));

        Select drparrive = new Select(driver.findElement(By.name("arrive")));
        drpdepart.selectByVisibleText("Paris");

        //drparrive.selectByVisibleText("Paris");


        Thread.sleep(5000);

        driver.findElement(By.name("departDate")).sendKeys("01/19/2019");


       // driver.findElement(By.name("returnDate")).sendKeys("01/21/2019");


        driver.findElement(By.name("seatPref")).click();

        driver.findElement(By.xpath("/html/body/blockquote/form/table/tbody/tr[5]/td[1]/label[2]")).click();



        driver.findElement(By.xpath("/html/body/blockquote/form/table/tbody/tr[5]/td[3]/label[1]")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/blockquote/form/table/tbody/tr[7]/td/input")).click();



    }
}

