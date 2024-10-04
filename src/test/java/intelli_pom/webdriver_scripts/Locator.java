package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locator {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        List<WebElement> a=driver.findElements(By.linkText("a"));
        System.out.println(a.size());
        Thread.sleep(2000);

        for (int e=0;e<a.size();e++)
        {
            System.out.println(a.get(e).getText());
        }
        List<WebElement> t=driver.findElements(By.tagName("spam"));
        System.out.println(t.size());
        for (int r=0;r<t.size();r++)
        {
            System.out.println(t.get(r).getText());
        }
        driver.findElement(By.xpath("//input[@name=\"email\"][@name=\"email\"]")).sendKeys("9717502990");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"pass\"or@id=\"pass\"]")).sendKeys("Vanditiasharma10");
        Thread.sleep(2000);
        String ftext= driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
        System.out.println(ftext);
        Thread.sleep(2000);
        String ptext=driver.findElement(By.xpath("//h2[text()=\"Facebook helps you connect and share with the people in your life.\"]")).getText();
        System.out.println(ptext);
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
        Thread.sleep(2000);



    }
}
