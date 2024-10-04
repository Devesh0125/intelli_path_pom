package webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.List;

public class Test6_practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
       String tittle= driver.getTitle();
        System.out.println(tittle);
        Thread.sleep(2000);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(2000);
        driver.findElement(By.id("nav-link-accountList")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("ap_email")).sendKeys("9717502990");
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(2000);
        List<WebElement> d=driver.findElements(By.tagName("a"));
        System.out.println(d.size());
        for (int i=0;i<d.size();i++){
            System.out.println("**"+d.get(i).getText());

       }List<WebElement> s=driver.findElements(By.tagName("span"));
        System.out.println(s.size());
       for (int e=0;e<s.size();e++)        {
            System.out.println(s.get(e).getText());
        }By ptaxt= RelativeLocator.with(By.linkText("a-label a-checkbox-label")).toRightOf(By.name("rememberMe"));
        System.out.println(ptaxt);
        driver.close();


    }
}
