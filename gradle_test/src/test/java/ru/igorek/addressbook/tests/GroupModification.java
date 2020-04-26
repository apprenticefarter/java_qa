package ru.igorek.addressbook.tests;

import org.junit.Test;
import ru.igorek.addressbook.model.GroupData;
import ru.igorek.addressbook.model.TestBase;

public class groupModification extends TestBase {
    @Test
    public void testGroupModification(){
        app.getGroupHelper().chooseGroups();
        app.getGroupHelper().chooseGrouptoEdit();
        app.getGroupHelper().initGroupMod();
        app.getGroupHelper().fillGroup(new GroupData("HHHHH", null, null));
        app.getGroupHelper().initUpdate();
    }
}
