package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase {

    public GroupHelper(WebDriver driver) {
        super(driver);

    }

    public void fillGroup(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());

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


}
