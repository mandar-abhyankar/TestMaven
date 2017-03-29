package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by Mandar Abhyankar on 3/27/2017.
 */
public class TestMavenCmd {


    private static WebDriver webDriver;

    @BeforeTest
    public void initializeTest(){


        System.setProperty("webdriver.chrome.driver","C:\\www\\drivers\\chrome_driver\\ChromeDriver.exe");
        webDriver = new ChromeDriver();
        //Sample change here
        //Another sample change here

    }

    @Test
    public void actualTest(){

        webDriver.navigate().to("http://executeautomation.com/demosite/Login.html");
        webDriver.manage().window().maximize();
        webDriver.findElement(By.name("UserName")).sendKeys("admin");
        webDriver.findElement(By.name("Password")).sendKeys("adminpassw");
        webDriver.findElement(By.name("Login")).submit();


    }

    @AfterTest
    public void tearDown(){

        webDriver.quit();

    }







}
