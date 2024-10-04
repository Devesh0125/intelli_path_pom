package intelli_pom.webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Upload_method {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://smallpdf.com/pdf-to-word");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Choose Files']")).click();
        Thread.sleep(2000);
        StringSelection s=new StringSelection("C:\\Users\\Davesh.Sharma\\43819_TaxStatement_Nov2023.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        Thread.sleep(2000);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        r.keyPress(KeyEvent.VK_PAGE_UP);
        WebElement convert=new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Convert']")));
        convert.click();

        WebElement downlode =new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Download']")));
        downlode.click();
        Thread.sleep(2000);


       }
}
