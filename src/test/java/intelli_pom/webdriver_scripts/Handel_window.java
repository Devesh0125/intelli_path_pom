package intelli_pom.webdriver_scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;

public class Handel_window {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(2000);
        ArrayList<String> tab=new ArrayList<>(driver.getWindowHandles());
        System.out.println(tab);
        Thread.sleep(2000);
        driver.switchTo().window(tab.get(1));
        Thread.sleep(2000);
        String ptext=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(ptext);
        Thread.sleep(2000);
        driver.close();
        driver.switchTo().window(tab.get(0));
        Thread.sleep(1000);
        driver.close();


    }
}
