package intelli_pom.webdriver_scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class handleing_frame {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.switchTo().frame("frame1");
        Thread.sleep(2000);

        String ptext= driver.findElement(By.xpath("(//h1[text()=\"This is a sample page\"])[1]")).getText();
        System.out.println(ptext);

        Thread.sleep(4000);

        driver.switchTo().defaultContent();
        Thread.sleep(4000);

        driver.switchTo().frame("frame2");
        Thread.sleep(4000);

        String ptext2= driver.findElement(By.xpath("(//h1[text()=\"This is a sample page\"])[1]")).getText();
        System.out.println(ptext2);

        Thread.sleep(4000);
        driver.switchTo().defaultContent();
        driver.close();
        Thread.sleep(2000);
        driver.quit();

    }
}
