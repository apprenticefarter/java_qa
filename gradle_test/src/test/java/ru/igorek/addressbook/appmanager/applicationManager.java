package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class applicationManager {
    public WebDriver driver;

    private  sessionHelper sessionHelper;
    private  groupHelper groupHelper;
    public Map<String, Object> vars;
    JavascriptExecutor js;

    public void init() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        groupHelper = new groupHelper(driver);
        sessionHelper = new sessionHelper(driver);
        sessionHelper.login("admin", "secret");

    }



    public void stop() {
        driver.quit();
    }

    public ru.igorek.addressbook.appmanager.groupHelper getGroupHelper() {
        return groupHelper;
    }

    public ru.igorek.addressbook.appmanager.sessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
