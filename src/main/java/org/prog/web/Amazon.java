package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.amazon.com/");

      WebElement AmazonSearch = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        AmazonSearch.sendKeys("Iphone 15");
        AmazonSearch.sendKeys(Keys.ENTER);

            WebElement firstElement = driver.findElement(By.xpath("//span[@class='nav-input nav-progressive-attribute][1]"));
            firstElement.isDisplayed();

    }
        finally {
        driver.quit();
    }
  }
}





