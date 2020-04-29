package ru.igorek.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.igorek.addressbook.model.ContactData;
import ru.igorek.addressbook.model.TestBase;

public class contactModification extends TestBase {
    @Test
    public void testContatcModification(){
        if (! app.getContactHElper().contactExistanceCheck()){
            app.getContactHElper().createNewContact(new ContactData("Cent", "50",
                    "Jacobs", "LUL", "mexico", "911","[none]"),true);
            app.getContactHElper().goHome();
        }
        int before = app.getContactHElper().countContact();

        app.getContactHElper().chooseEdit();
        app.getContactHElper().fillContact(new ContactData("George",null,
                null,null,null,null,null),false);
        app.getContactHElper().clickUpdate();
        app.getContactHElper().goHome();
        int after = app.getContactHElper().countContact();
        Assert.assertEquals(after, before -1);
    }
}
