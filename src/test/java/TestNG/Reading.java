package TestNG;

import jxl.Cell;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;


public class Reading {
    public WebDriver driver;
    @Test(dataProvider ="sd_login")
    public void sdlogin(String uname,String pwd) throws InterruptedException
    {
        driver=new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys(uname);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys(pwd);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
        Thread.sleep(2000);
        String ExpectedUrl="https://www.saucedemo.com/";
        String Actualurl= driver.getCurrentUrl();
      //  Assert.assertEquals(Actualurl,ExpectedUrl);
        //or
        if (Actualurl.equals(ExpectedUrl)){
            System.out.println("The test case Passes ");
        }else{
            System.out.println("Test case failes ");
        }
    }
    @AfterMethod
public void tearDown()
    {
        driver.close();
}
@DataProvider(name ="sd_login")
    public Object[][] readExcel() throws BiffException, IOException {
    //open the Ecxel file for Read And write which is available with in teh same package
    File f = new File("C:\\Users\\Davesh.Sharma\\Downloads\\TestData_SwagDemo (1).xls");//To open the excel file
    Workbook w = Workbook.getWorkbook(f);
    Sheet s=w.getSheet(0);//
    int noofRow=s.getRows();
    int noofcolums=s.getColumns();
//creating the arrey to store the daat in excel sheet
String inputData[][]=new String[noofRow-1][noofcolums];
int count=0;
for (int i=1;i<noofRow;i++){
    for (int j=0;j<noofcolums;j++)
    {
        Cell c=s.getCell(j,i); //column,row

        inputData[count][j]=c.getContents();

    }
     count++;
}
return inputData;
}
}
