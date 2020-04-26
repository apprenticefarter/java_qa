package ru.igorek.addressbook.tests;

import org.junit.Test;
import ru.igorek.addressbook.model.ContactData;
import ru.igorek.addressbook.model.TestBase;

public class contactMoDification extends TestBase {
    @Test
    public void testContatcModification(){
        app.getContactHElper().chooseEdit();
        app.getContactHElper().fillContact(new ContactData("George",null,
                null,null,null,null,null),false);
        app.getContactHElper().clickUpdate();
    }
}
