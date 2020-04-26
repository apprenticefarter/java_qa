package ru.igorek.addressbook.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
    public WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    public void type(By locator, String text) {
        click(locator);


        if (text != null){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);}
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    protected boolean isElemetPresent(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
