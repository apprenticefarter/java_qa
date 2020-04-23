package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    public WebDriver driver;

    private  ContactHElper contactHElper;
    private SessionHelper sessionHelper;
    private GroupHelper groupHelper;
    public Map<String, Object> vars;
    JavascriptExecutor js;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public void init() {
        if (browser.equals(BrowserType.FIREFOX)){
            driver = new FirefoxDriver();}
        else if (browser.equals(BrowserType.CHROME))
            driver = new ChromeDriver();
        else if (browser.equals(BrowserType.IE))
            driver = new InternetExplorerDriver();

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
