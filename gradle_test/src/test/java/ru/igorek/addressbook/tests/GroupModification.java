package ru.igorek.addressbook.tests;

import org.junit.Test;
import ru.igorek.addressbook.appmanager.GroupData;
import ru.igorek.addressbook.model.TestBase;

public class GroupModification extends TestBase {
    @Test
    public void testGroupModification(){
        app.getGroupHelper().chooseGroups();
        app.getGroupHelper().initGroupMod();
        app.getGroupHelper().fillGroup(new GroupData("222", "dd", "ff"));
        app.getGroupHelper().initUpdate();
    }
}
