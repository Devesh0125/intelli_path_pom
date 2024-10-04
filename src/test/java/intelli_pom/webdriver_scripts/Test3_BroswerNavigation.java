package webdriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Test3_BroswerNavigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","C:\\Users\\Davesh.Sharma\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }
}
