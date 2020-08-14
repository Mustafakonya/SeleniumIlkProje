package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverOdev {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/admin/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        driver.navigate().to("http://youtube.com");
        String title2 = driver.getTitle();
        String url2 = driver.getCurrentUrl();
        System.out.println(title2);
        System.out.println(url2);
        driver.navigate().back();
        String url3 = driver.getCurrentUrl();
        System.out.println(url3);
        driver.quit();




    }
}
