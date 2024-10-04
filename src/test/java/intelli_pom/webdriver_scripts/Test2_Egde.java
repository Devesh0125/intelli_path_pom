package webdriver_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test2_Egde {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.edge.driver","C:\\UsersDavesh.Sharma\\Downloads\\software backups\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://www.selenium.dev/");
        Thread.sleep(5000);
        driver.manage().window().minimize();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        String tittle=driver.getTitle();
        System.out.println(tittle);
        Thread.sleep(5000);
        String Url=driver.getCurrentUrl();
        System.out.println(Url);
        Thread.sleep(5000);
        String page=driver.getPageSource();
        System.out.println(page);
        Thread.sleep(5000);
        driver.close();
    }
}
