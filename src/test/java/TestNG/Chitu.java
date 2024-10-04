package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Chitu {
    WebDriver driver = new ChromeDriver();
    @Test(priority = 0)
    public void my() throws InterruptedException {

        driver.get("https://only-testing-blog.blogspot.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(4000);
    }
    @Test(priority = 1)
    public void findurl() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='gparent_1']")).sendKeys("Chiman lal sharma");
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void findurl1() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='parent_1']")).sendKeys("Umesh chander Sharma");
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void findurl2() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='child_1']")).sendKeys("Davesh chander sharma");
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void findurl3() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='tooltip-1']")).sendKeys("Lakshary Sharma");
        Thread.sleep(2000);
    }

    @Test(priority = 5)

    public void findurl4() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='sname']")).sendKeys("Sharma");
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void findurl5() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='yaddress']")).sendKeys("Laxmi vatika Defence Enclave Near T.v Tower Lal Fatak Badaun Road Baerilly");
        Thread.sleep(3000);
    }
    @Test(priority = 7)
    public void checkbox() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Table With Checkbox']/following::*[10]")).click();
        driver.findElement(By.xpath("//a[text()='Table With Checkbox']/following::*[15]")).click();
        driver.findElement(By.xpath("//a[text()='Table With Checkbox']/following::*[18]")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void chlik() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Selectable']")).click();
        driver.navigate().back();
        Thread.sleep(4000);
    }
    @Test(priority = 9)
    public void Drag() throws InterruptedException {
        driver.findElement(By.xpath("//a[text()='Drag and Drop']")).click();
        Thread.sleep(2000);
        Actions a = new Actions(driver);
        WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement drop = driver.findElement(By.xpath("//p[text()='Drop here']"));
        a.dragAndDrop(drag, drop).build().perform();
        Thread.sleep(3000);
        driver.navigate().back();
        WebElement doubble = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions b = new Actions(driver);
        b.doubleClick(doubble).build().perform();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        driver.close();
    }
}


