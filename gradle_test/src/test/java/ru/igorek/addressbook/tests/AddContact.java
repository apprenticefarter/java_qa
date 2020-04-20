package ru.igorek.addressbook.tests;

import org.junit.Test;
import ru.igorek.addressbook.appmanager.ContactData;
import ru.igorek.addressbook.model.testbase;

public class AddContact extends testbase {
    @Test
    public void testAddContact(){
       app.getContactHElper().chooseADdCOntact();
       app.getContactHElper().initNewContact();
       app.getContactHElper().fillContact(new ContactData("Cent", "50", "Jacobs", "LUL", "mexico", "911"));
       app.getContactHElper().submitContact();

    }

}
