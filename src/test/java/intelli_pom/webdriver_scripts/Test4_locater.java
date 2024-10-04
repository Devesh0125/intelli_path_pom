package intelli_pom.webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Test4_locater {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("Webdriver.chrome.driver","C:\\Users\\Davesh.Sharma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("lakshay");
        Thread.sleep(3000);

        driver.findElement(By.name("lastname")).sendKeys("Sharma");
        Thread.sleep(3000);

        driver.findElement(By.id("password_step_input")).sendKeys("lakshay.shar5ma@0125");
        Thread.sleep(3000);

       driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
        Thread.sleep(3000);

        Select day=new Select(driver.findElement(By.name("birthday_day")));
        day.selectByValue("2");
        Thread.sleep(3000);

        Select month=new Select(driver.findElement(By.name("birthday_month")));
        month.selectByIndex(11);
        Thread.sleep(3000);

        Select year=new Select(driver.findElement(By.id("year")));
        year.selectByValue("1995");
        Thread.sleep(2000);

        By maleRB= RelativeLocator.with(By.tagName("input")).below(By.name("birthday_month"));
        driver.findElement(maleRB).click();
        Thread.sleep(2000);

        By femaleRB= RelativeLocator.with(By.tagName("input")).below(By.name("birthday_day"));
        driver.findElement(femaleRB).click();
        Thread.sleep(2000);

        By ptext=RelativeLocator.with(By.tagName("p")).below(maleRB);
        String plane=driver.findElement(ptext).getText();
        System.out.println(plane);
        driver.close();

    }
}
