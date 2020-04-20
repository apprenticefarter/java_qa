package ru.igorek.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ContactHElper extends helperBase {
    public ContactHElper(WebDriver driver) {
        super(driver);

    }

    public void fillContact(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("middlename"),contactData.getMidllename());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("nickname"),contactData.getNickname());
        type(By.name("address"),contactData.getAddress());
        type(By.name("mobile"),contactData.getPhonenumber());


    }
    public void initNewContact() {
        click(By.name("firstname"));
    }
    public void chooseADdCOntact() {
        click(By.linkText("add new"));
    }
    public void submitContact() {
        click(By.cssSelector("input:nth-child(87)"));
    }
    public void deleteContact() {


        click(By.id("9"));
        click(By.cssSelector(".left:nth-child(8) > input"));
        assertThat(driver.switchTo().alert().getText(), is("Delete 1 addresses?"));
        driver.switchTo().alert().accept();


    }





}
