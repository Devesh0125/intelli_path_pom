import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Online_testing {
    public static void main(String[] args) throws InterruptedException {



    WebDriver driver=new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"gparent_1\"]")).sendKeys("hero");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"parent_1\"]")).sendKeys("hero 2");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"child_1\"]")).sendKeys("hero 3");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=\"Tooltip\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"tooltip-1\"]")).sendKeys("hero 4");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"sname\"]")).sendKeys("hero 5");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=\"iframe1\"]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=\"Table With Checkbox\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()=\"Aravind\"]/preceding::*[12]")).click();
        driver.findElement(By.xpath("//span[text()=\"Aravind\"]/preceding::*[4]")).click();
        driver.findElement(By.xpath("//span[text()=\"Aravind\"]/preceding::*[7]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.xpath("//a[text()=\"Selectable\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-state-default ui-corner-all\"]/preceding::*[5]")).click();
        Thread.sleep(2000);
       WebElement slide= driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]/preceding::*[3]"));
        Actions a=new Actions(driver);
        a.dragAndDropBy(slide,90,0).build().perform();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]")).click();
        Thread.sleep(2000);
        WebElement drag= driver.findElement(By.xpath("//div[@id=\"dragdiv\"]// following::*[1]"));
       WebElement drop= driver.findElement(By.xpath("//div[@id=\"dragdiv\"]// following::*[3]"));
       a.dragAndDrop(drag,drop).build().perform();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]")).click();
        Thread.sleep(2000);
        WebElement element= driver.findElement(By.xpath("//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));
       a.dragAndDropBy(element,150,80).build().perform();
       driver.navigate().back();
        driver.close();





    }
}
