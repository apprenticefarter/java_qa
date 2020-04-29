package ru.igorek.addressbook.appmanager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.igorek.addressbook.model.ContactData;
import ru.igorek.addressbook.model.HelperBase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ContactHElper extends HelperBase {
    public ContactHElper(WebDriver driver) {
        super(driver);

    }

    public void fillContact(ContactData contactData,boolean creation) {

        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("middlename"),contactData.getMidllename());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("nickname"),contactData.getNickname());
        type(By.name("address"),contactData.getAddress());
        type(By.name("mobile"),contactData.getPhonenumber());
        if(creation){
            new Select (driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else
            Assert.assertFalse(isElemetPresent(By.name("new_group")));

    }

    public void clickUpdate(){
        click(By.name("update"));
    }
    public void initNewContact() {
        click(By.name("firstname"));
    }
    public void chooseADdCOntact() {
        click(By.linkText("add new"));
    }
    public void chooseEdit(){
        click(By.cssSelector("tr:nth-child(2) > .center:nth-child(8) img"));
    }
    public void submitContact() {
        click(By.cssSelector("input:nth-child(87)"));
    }
    public void deleteContact() {


        click(By.name("selected[]"));
        click(By.cssSelector(".left:nth-child(8) > input"));
        assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
        driver.switchTo().alert().accept();


    }


    public void createNewContact(ContactData data,boolean creation) {
        chooseADdCOntact();
        initNewContact();
        fillContact(data,creation);
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
}
