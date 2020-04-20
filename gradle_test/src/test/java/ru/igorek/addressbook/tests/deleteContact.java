package ru.igorek.addressbook.tests;

import org.junit.Test;
import ru.igorek.addressbook.model.testbase;

public class deleteContact extends testbase {
   @Test
   public void testDeleteContact(){

      app.getContactHElper().deleteContact();

   }
}
