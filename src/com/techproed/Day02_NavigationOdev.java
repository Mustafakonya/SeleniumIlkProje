package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationOdev {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/admin/Documents/selenium libraries/drivers/chromedriver");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        webDriver.navigate().to("http://youtube.com");
        webDriver.navigate().back();
        webDriver.navigate().forward();
        webDriver.navigate().refresh();
        webDriver.quit();




    }


}
