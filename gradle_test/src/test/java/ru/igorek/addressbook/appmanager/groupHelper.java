package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.igorek.addressbook.model.GroupData;
import ru.igorek.addressbook.model.HelperBase;

import java.util.ArrayList;
import java.util.List;

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
    public void chooseGrouptoEdit(int index){
      driver.findElements(By.name("selected[]")).get(index).click();
    }
    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void initGroupMod() {
        click(By.name("edit"));
    }

    public void initUpdate() {
        click(By.name("update"));
    }


    public void createGroup(GroupData group) {
        chooseNewGroup();
        fillGroup(group);
        submitGroup();
    }

    public boolean chekGroupExistance() {
        return isElemetPresent(By.name("selected[]"));
    }

    public int countGroups() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public List<GroupData> getGroupList() {
        List<GroupData> groups = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.cssSelector("span.group"));

        for (WebElement element : elements){
            String name = element.getText();
            int id =Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            GroupData group = new GroupData(id,name,null,null);
            groups.add(group);
        }
        return groups;
    }
}
