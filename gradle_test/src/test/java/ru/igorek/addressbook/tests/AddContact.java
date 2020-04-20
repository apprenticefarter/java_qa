package ru.igorek.addressbook.tests;

import org.junit.Test;
import ru.igorek.addressbook.model.testbase;

public class AddContact extends testbase {
    @Test
    public void testAddContact(){
       app.getGroupHelper().chooseADdCOntact();
       app.getGroupHelper().fillContact();
    }

}
