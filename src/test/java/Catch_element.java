import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Catch_element {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement sbox =driver.findElement(By.xpath("//input[@name='q']"));
        Actions a=new Actions(driver);
        a.click(sbox).sendKeys("SmartPhone").build().perform();
        Thread.sleep(3000);
        a.click(sbox).sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(2000);
        a.click(sbox).sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(2000);
        a.click(sbox).sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(2000);
        a.click(sbox).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        driver.close();
    }
}
