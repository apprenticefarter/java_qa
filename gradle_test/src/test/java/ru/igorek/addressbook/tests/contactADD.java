package ru.igorek.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.igorek.addressbook.model.ContactData;
import ru.igorek.addressbook.model.TestBase;

public class contactADD extends TestBase {
    @Test
    public void testAddContact() {
        int before = app.getContactHElper().countContact();
        app.getContactHElper().chooseADdCOntact();
        app.getContactHElper().initNewContact();
        app.getContactHElper().fillContact(new ContactData("Cent", "50",
                "Jacobs", "LUL", "mexico", "911", "222"), true);
        app.getContactHElper().submitContact();
        app.getContactHElper().goHome();
        int after = app.getContactHElper().countContact();
        Assert.assertEquals(after, before + 1);

    }

}
