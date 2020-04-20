package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class helperBase {
    public WebDriver driver;

    public helperBase(WebDriver driver) {
        this.driver = driver;
    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
