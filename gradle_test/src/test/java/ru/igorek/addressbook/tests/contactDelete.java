package ru.igorek.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.igorek.addressbook.model.ContactData;
import ru.igorek.addressbook.model.TestBase;

import java.util.List;

public class contactDelete extends TestBase {
   @Test
   public void testDeleteContact(){
      if (! app.getContactHElper().contactExistanceCheck()){
         app.getContactHElper().createNewContact(new ContactData("Cent", "50",
                 "Jacobs", "LUL", "mexico", "911","[none]"),true);
         app.getContactHElper().goHome();
      }
      //int before = app.getContactHElper().countContact();
      List<ContactData> before = app.getContactHElper().getContactList();

      app.getContactHElper().deleteContact();
      app.getContactHElper().goHome();

      List<ContactData> after = app.getContactHElper().getContactList();
      Assert.assertEquals(after.size(),before.size() -1);
      //int after = app.getContactHElper().countContact();
      //Assert.assertEquals(after, before -1);

   }
}
