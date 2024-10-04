package intelli_pom.webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Test5_MultipleOperation {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("Webdriver.chrom.driver","C:\\Users\\Davesh.Sharma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        WebElement fname=driver.findElement(By.name("firstname"));
        fname.sendKeys("Tuk TUK ");
        Thread.sleep(2000);
        fname.clear();
        Thread.sleep(2000);
        fname.sendKeys("Kritika");
        String fnamevale=fname.getAttribute("value");
        System.out.println(fnamevale);
        WebElement lname=driver.findElement(By.name("lastname"));
        lname.sendKeys("Sharma");
        Thread.sleep(2000);
        lname.clear();
        Thread.sleep(2000);
        lname.sendKeys("Vishwakarma");
        Thread.sleep(2000);
        String lnamevale=lname.getAttribute("value");
        System.out.println(lnamevale);
        driver.findElement(By.name("reg_email__")).sendKeys("Davesh.sharma@shl.com");
        Thread.sleep(2000);
        driver.findElement(By.id("password_step_input")).sendKeys("Hello@123");
        Thread.sleep(2000);
        Select day=new Select(driver.findElement(By.name("birthday_day")));
        day.selectByValue("25");
        Select month=new Select(driver.findElement(By.name("birthday_month")));
        month.selectByIndex(10);
        Select year=new Select(driver.findElement(By.id("year")));
        year.selectByValue("1996");
        By maleRb= RelativeLocator.with(By.tagName("input")).below(By.name("birthday_day"));
        driver.findElement(maleRb).click();
        By female=RelativeLocator.with(By.tagName("input")).toRightOf(maleRb);
        driver.findElement(female).click();
        Thread.sleep(2000);
        By ptext=RelativeLocator.with(By.tagName("p")).below(maleRb);
        String pline= driver.findElement(ptext).getText();
        System.out.println(pline);
        driver.close();




    }
}
