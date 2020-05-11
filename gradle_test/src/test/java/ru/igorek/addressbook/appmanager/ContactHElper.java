package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.igorek.addressbook.model.ContactData;
import ru.igorek.addressbook.model.HelperBase;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;


public class ContactHElper extends HelperBase {
    public ContactHElper(WebDriver driver) {
        super(driver);

    }

    public void fillContact(ContactData contactData) {

        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("middlename"), contactData.getMidllename());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("nickname"), contactData.getNickname());
        type(By.name("address"), contactData.getAddress());
        type(By.name("mobile"), contactData.getPhonenumber());


    }

    public void clickUpdate() {
        click(By.name("update"));
    }

    public void initNewContact() {
        click(By.name("firstname"));
    }

    public void chooseADdCOntact() {
        click(By.linkText("add new"));
    }

    public void chooseEdit() {
        click(By.cssSelector("tr:nth-child(2) > .center:nth-child(8) img"));
    }

    public void submitContact() {
        click(By.cssSelector("input:nth-child(87)"));
    }

    public void deleteContact() {
        click(By.name("selected[]"));
        click(By.xpath("//input[@value='Delete']"));
        acceptNextAlert = true;
        assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));


    }


    public void createNewContact(ContactData data) {
        chooseADdCOntact();
        initNewContact();
        fillContact(data);
        submitContact();
    }

    public boolean contactExistanceCheck() {
        return isElemetPresent(By.name("selected[]"));
    }

    public void goHome() {
        click(By.linkText("home"));
    }

    public int countContact() {
        return driver.findElements(By.name("selected[]")).size();
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.xpath("//table[@id=\'maintable\']/tbody/tr"));
        for (int i = 2; i < elements.size() + 1; i++) {
            String name = driver.findElement(By.xpath("//table[@id=\'maintable\']/tbody/tr[" + i + "]/td[3]")).getText();
            System.out.println(name);
            //int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            ContactData contact = new ContactData(name, null, null, null,
                    null, null, null);
            contacts.add(contact);
        }
        return contacts;
    }
}
