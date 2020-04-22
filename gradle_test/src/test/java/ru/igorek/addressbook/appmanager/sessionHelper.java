package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SessionHelper extends HelperBase {
    public SessionHelper(WebDriver driver){
        super(driver);
    }

    public void login(String login, String password) {
        driver.get("http://localhost:8080/addressbook/");
        driver.manage().window().setSize(new Dimension(550, 697));
        type(By.name("user"),login);
        type(By.name("pass"),password);
        driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
        WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("groups")));
    }
    public void logOut() {
        driver.findElement(By.linkText("Logout")).click();
    }
}
