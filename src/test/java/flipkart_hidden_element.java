import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Set;

public class flipkart_hidden_element {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
       WebElement sbox= driver.findElement(By.xpath("//input[@name='q']"));
        Actions e=new Actions(driver);
        e.click(sbox).sendKeys("Smartphone").build().perform();
        Thread.sleep(5000);
        e.click(sbox).sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(2000);
        e.click(sbox).sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(2000);
        e.click(sbox).sendKeys(Keys.DOWN).build().perform();
        Thread.sleep(2000);
        e.click(sbox).sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(text(),'iVoomi Me1 (Carbon Black, 8 GB)')]")).click();
        Thread.sleep(3000);
        //String currentWindow = driver.getWindowHandle();
        Set<String> rsult = driver.getWindowHandles();
        for (String s : rsult){
            System.out.println(s);
        }
        ArrayList<String> tab=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
        driver.close();
        driver.switchTo().window(tab.get(0));
        driver.close();





    }
}
