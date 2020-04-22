package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    public WebDriver driver;

    private  ContactHElper contactHElper;
    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    public Map<String, Object> vars;
    JavascriptExecutor js;

    public void init() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        groupHelper = new GroupHelper(driver);
        sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
        contactHElper = new ContactHElper(driver);


    }


    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public ContactHElper getContactHElper() {
        return contactHElper;
    }
}
