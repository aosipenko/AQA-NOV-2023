package org.prog.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v117.audits.model.StyleSheetLoadingIssueReason;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class SeleniumHomework {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        WebElement searchInput = driver.findElement(By.name("field-keywords"));
        searchInput.sendKeys("iPhone 15");
        searchInput.sendKeys(Keys.ENTER);

        List<WebElement> searchResult = new WebDriverWait(driver, Duration.ofSeconds(10L))
                .until(ExpectedConditions.numberOfElementsToBe(
                        By.xpath("//span[contains(text(), 'K-i-Phone 15 Pro')]"), 1));

        driver.quit();
    }
}
