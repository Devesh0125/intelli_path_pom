package intelli_pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class Mouse_hoveraction {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//span[contains(text(),'Login')])[2]/preceding::*[1]")).click();
        Thread.sleep(3000);
        WebElement fasion=driver.findElement(By.xpath("//span[text()='Fashion']"));
        Actions a=new Actions(driver);
        a.moveToElement(fasion).build().perform();
        Thread.sleep(3000);
        WebElement women=driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
        a.moveToElement(women).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Women Sarees']")).click();
        driver.close();
    }
}
