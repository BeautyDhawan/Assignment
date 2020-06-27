package com.quicker.Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;



    public TestBase()
    {

        prop = new Properties();
        FileInputStream ip = null;
        try
        {
            ip = new FileInputStream("C:\\Users\\Beauty\\IdeaProjects\\untitled7\\src\\main\\java\\com\\quicker\\config\\config.properties");
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        try
        {
            prop.load(ip);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public JavascriptExecutor convertToJsExecutor(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    public static void initialization() throws InterruptedException {
        String browsername = prop.getProperty("browser");
        if (browsername.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Beauty\\Desktop\\New\\geckodriver.exe");


            driver = new FirefoxDriver();

        }



        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        Thread.sleep(10000);
        driver.get(prop.getProperty("url"));


    }
}
