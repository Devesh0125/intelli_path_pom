package intelli_pom.webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test6_Getlink {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        String url=driver.getCurrentUrl();
        System.out.println(url);
        Thread.sleep(2000);
        String titlle=driver.getTitle();
        System.out.println(titlle);
        Thread.sleep(2000);
        List<WebElement> e=driver.findElements(By.tagName("a"));
        System.out.println(e.size());
        for (int i=0;i<e.size();i++){
            System.out.println(e.get(i).getText());

        }
        List<WebElement> t=driver.findElements(By.tagName("spam"));
        System.out.println(t.size());
          for (int r=0;r<t.size();r++)
          {
              System.out.println(t.get(r).getText());
          }driver.close();
    }
}
