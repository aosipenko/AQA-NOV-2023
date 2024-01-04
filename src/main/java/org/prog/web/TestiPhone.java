package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;

public class TestiPhone {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        try { driver.get("https://by.ebay.com/");
            WebElement EbaySearch = driver.findElement(By.xpath("//input[@id='gh-ac']"));
            EbaySearch.sendKeys("Iphone 15");
            EbaySearch.sendKeys(Keys.ENTER);

            List<WebElement> searchResult = new WebDriverWait(driver, Duration.ofSeconds(5L))
                    .until(ExpectedConditions.numberOfElementsToBe(
                            By.xpath("//span[contains(text(), 'K-i-Phone 15')]"), 1));

            if (searchResult.size() >= 1) {
                    System.out.println("iPhone 15 is found!");
                }
            }

        finally {
            driver.quit();
        }
    }
}



