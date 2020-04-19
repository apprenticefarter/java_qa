package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sessionHelper {
    public sessionHelper(WebDriver driver){
        this.driver = driver;
    }
    public WebDriver driver;

    public void login(String login, String password) {
        driver.get("http://localhost:8080/addressbook/");
        driver.manage().window().setSize(new Dimension(550, 697));
        driver.findElement(By.name("user")).click();
        driver.findElement(By.name("user")).sendKeys(login);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
        WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("groups")));
    }
    public void logOut() {
        driver.findElement(By.linkText("Logout")).click();
    }
}
