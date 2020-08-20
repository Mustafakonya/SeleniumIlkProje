package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.event.MouseInputListener;
import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiris {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/admin/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.get("http:/a.testaddressbook.com/");
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        WebElement sifre = driver.findElement(By.id("session_password"));
        sifre.sendKeys("Test1234!");
        WebElement tus = driver.findElement(By.name("commit"));
        tus.click();

        String baslik = driver.getTitle();
        if(baslik.equals("Address Book")){
            System.out.println("Giris Basarili");
        }else{
            System.out.println("Giris Basarisiz");
        }


    }
}
