package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.igorek.addressbook.tests.GroupData;

public class groupHelper {
    public WebDriver driver;

    public groupHelper(WebDriver driver) {

        this.driver = driver;
    }

    public void fillGroup(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
        submitGroup();

    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).sendKeys(text);
    }

    public void submitGroup() {
        click(By.name("submit"));
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void chooseNewGroup() {
        click(By.name("new"));
    }

    public void chooseGroups() {
        click(By.linkText("groups"));
    }

    public void deleteSelectedGroups() {
        click(By.cssSelector(".group:nth-child(6) > input"));
        click(By.name("delete"));
    }
}
