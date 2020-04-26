package ru.igorek.addressbook.tests;

import org.junit.Test;
import ru.igorek.addressbook.model.ContactData;
import ru.igorek.addressbook.model.TestBase;

public class addContact extends TestBase {
    @Test
    public void testAddContact(){
       app.getContactHElper().chooseADdCOntact();
       app.getContactHElper().initNewContact();
       app.getContactHElper().fillContact(new ContactData("Cent", "50",
               "Jacobs", "LUL", "mexico", "911","222"),true);
       app.getContactHElper().submitContact();

    }

}
