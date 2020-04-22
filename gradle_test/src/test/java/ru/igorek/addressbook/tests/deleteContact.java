package ru.igorek.addressbook.tests;

import org.junit.Test;
import ru.igorek.addressbook.model.TestBase;

public class deleteContact extends TestBase {
   @Test
   public void testDeleteContact(){

      app.getContactHElper().deleteContact();

   }
}
