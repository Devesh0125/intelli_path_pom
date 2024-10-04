package intelli_pom.webdriver_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc_plateform {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://talentcentral-2a.eu.shl.zone/admin/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='CybotCookiebotDialogBodyLevelButtonAccept']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Davesh.sharma@shl.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Devki@12345");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='proceed']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='menu-text'][1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul[@class='submenu']//a[contains(text(),'Search Company')] ")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='allcompaniestable_filter']//input")).sendKeys("Davesh company");
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[contains(text(),'Davesh company')]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[contains(text(),'Create New')]")).click();//a[@id='create-new-project-item']
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@id='create-new-project-item']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='btnSelectProjectType']")).click();
        Thread.sleep(5000);
        WebElement sbox2= driver.findElement(By.xpath("//i[@class='ceb-icon_notifications']//following ::*[2]"));
        Actions e=new Actions(driver);
        e.click(sbox2).build().perform();
        driver.findElement(By.xpath("//a[@class='singleNotification'][1]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@id='clone-project' or @name='clone-project'][1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='input-group input-group-responsive']/input[1]")).sendKeys("Davesh Testing ");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='deadlineDate']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@class='day'][6]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='s2id_select-Appform']/a[1]/span[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='select2-arrow' and //label[@class='select2-offscreen']]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='CreateProjectUsersSection']/div[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='CreateProjectCandidatesSectionHeader']/div[1]/h4[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[@id='multiUseLinkChk']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='publishProjectBottomNav']")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
