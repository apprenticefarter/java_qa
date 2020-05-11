package ru.igorek.addressbook.tests;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import ru.igorek.addressbook.model.ContactData;
import ru.igorek.addressbook.model.GroupData;
import ru.igorek.addressbook.model.TestBase;

import java.util.Comparator;
import java.util.List;

public class contactADD extends TestBase {

    @Test
    public void testAddContact() {
        //int before = app.getContactHElper().countContact();
        List<ContactData> before = app.getContactHElper().getContactList();
        app.getContactHElper().chooseADdCOntact();
        app.getContactHElper().initNewContact();
        app.getContactHElper().fillContact(new ContactData("Cent", "50",
                "Jacobs", "LUL", "mexico", "911", "222"));
        app.getContactHElper().submitContact();
        app.getContactHElper().goHome();
        List<ContactData> after = app.getContactHElper().getContactList();

        Comparator<? super ContactData> byName = (s1,s2) -> s1.getFirstname().compareTo(s2.getFirstname());
        before.add(new ContactData("Cent", "50",
                "Jacobs", "LUL", "mexico", "911", "222"));
        before.sort(byName);
        after.sort(byName);
        Assert.assertEquals(after,before);



        //int after = app.getContactHElper().countContact();
        //Assert.assertEquals(after, before + 1);

    }

}
