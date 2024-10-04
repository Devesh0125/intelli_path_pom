package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
@Test
public class SecondWay {
    public WebDriver driver;//Global variable for webdriver to use  in other method
    @Test
    public void setup(){
        driver=new ChromeDriver();

    }
    @Test(dependsOnMethods = "setup")
    public void gotourl() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
    }
    @Test(dependsOnMethods = "gotourl")
    public void type_username()  {
        try{
            driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);

        }
    }

    @Test(dependsOnMethods = "type_username")
    public void user_password() {
        try{
            driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret");
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println(e);

        }
    }

    @Test(dependsOnMethods = "user_password")
    public void click_on()  {
        try{
            driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
            Thread.sleep(2000);
        }catch (Exception e)
        {
            System.out.println(e);

        }
    }

    @Test(dependsOnMethods = "click_on")
    public void verify_login()  {
        try{
//           boolean elementPresnet= driver.findElement(By.xpath("//div[contains(text(),'3 lighting modes, 1 AAA battery included')]")).isDisplayed();
            boolean elementPresnet= driver.findElement(By.xpath("//h3[contains(text(),'Username and password do not match any user in this service')]")).isDisplayed();
            System.out.println(elementPresnet);

            System.out.println(elementPresnet);
            if (elementPresnet==true){
                System.out.println("Test case pass");
            }else {
                System.out.println("Test case fail");
            }
            /*String Expectedurl = "https://www.saucedemo.com/inventory.html";
            String Actualurl = driver.getCurrentUrl();
            Assert.assertEquals(Actualurl, Expectedurl);
*/
        }catch (Exception e){
            System.out.println(e);

        }
    }
    @Test(dependsOnMethods = "verify_login",alwaysRun = true)
    public void teardown() {
        try{

            driver.close();
        }catch (Exception e){
            System.out.println(e);

        }
    }




}
