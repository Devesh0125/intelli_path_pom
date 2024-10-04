package intelli_pom.webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

@Test
public class Web_alert {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Thread.sleep(2000);
       driver.switchTo().alert().sendKeys("Davesh chander sharma");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.close();




    }
}
