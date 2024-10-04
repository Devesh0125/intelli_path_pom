package intelli_pom.webdriver_scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Advance_action {
    @Test
/*
    public static void main(String[] args) throws InterruptedException {
*/public  void my() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(4000);
       driver.findElement(By.xpath("//input[@id='gparent_1']")).sendKeys("Chiman lal sharma");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@id='parent_1']")).sendKeys("Umesh chander Sharma");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='child_1']")).sendKeys("Davesh chander sharma");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='tooltip-1']")).sendKeys("Lakshary Sharma");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='sname']")).sendKeys("Sharma");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='yaddress']")).sendKeys("Laxmi vatika Defence Enclave Near T.v Tower Lal Fatak Badaun Road Baerilly");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Table With Checkbox']/following::*[10]")).click();
        driver.findElement(By.xpath("//a[text()='Table With Checkbox']/following::*[15]")).click();
        driver.findElement(By.xpath("//a[text()='Table With Checkbox']/following::*[18]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Selectable']")).click();
        driver.navigate().back();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
        Thread.sleep(2000);
        Actions a=new Actions(driver);
        WebElement drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement drop=driver.findElement(By.xpath("//p[text()='Drop here']"));
        a.dragAndDrop(drag,drop).build().perform();
        Thread.sleep(3000);
        driver.navigate().back();
       WebElement doubble=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
       Actions b=new Actions(driver);
       b.doubleClick(doubble).build().perform();
       Thread.sleep(3000);
       driver.switchTo().alert().dismiss();
       driver.close();






    }
}
