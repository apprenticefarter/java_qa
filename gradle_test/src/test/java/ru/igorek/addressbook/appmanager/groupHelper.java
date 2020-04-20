package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.igorek.addressbook.tests.GroupData;

public class groupHelper extends helperBase {

    public groupHelper(WebDriver driver) {
        super(driver);

    }

    public void fillGroup(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());

    }
    public void fillContact() {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("Cent");
        driver.findElement(By.name("middlename")).sendKeys("50");
        driver.findElement(By.name("lastname")).sendKeys("Jacobs");
        driver.findElement(By.name("nickname")).sendKeys("LUL");
        driver.findElement(By.name("address")).sendKeys("mexico");
        driver.findElement(By.name("mobile")).sendKeys("911");
        driver.findElement(By.cssSelector("input:nth-child(87)")).click();

    }

    public void submitGroup() {
        click(By.name("submit"));
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

    public void initGroupMod() {
        click(By.name("edit"));
    }

    public void initUpdate() {
        click(By.name("update"));
    }

    public void chooseADdCOntact() {
        click(By.linkText("add new"));
    }
}
