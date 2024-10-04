package webdriver_scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_chrom {


    public static void main(String[] args)throws InterruptedException {
        //LAUNCH THE CHROM BROWSE
        WebDriver driver=new ChromeDriver();
        //LAUNCH THE TEST URL(https://www.selenium.dev/)
        driver.get("https://www.selenium.dev/");
        //WAIT FOR THE 5 SECOND
        Thread.sleep(5000);
        //MANAGE THE WINDOW MINI
        driver.manage().window().minimize();
        //WAIT FOR THE 3 SECOND
        Thread.sleep(3000);
        //MANAGE THE WINDOW MINI
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // get the tittle of the url
        String pagetillte=driver.getTitle();
        System.out.println(pagetillte);
        //WAIT FOR THE 5SECOND
        Thread.sleep(3000);
        String pageurl= driver.getCurrentUrl();
        System.out.println(pageurl);
        //WAIT FOR THE 3 SECOND
        Thread.sleep(3000);
        driver.quit();




    }
}
