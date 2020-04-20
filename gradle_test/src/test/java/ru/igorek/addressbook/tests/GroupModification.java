package ru.igorek.addressbook.tests;

import org.junit.Test;
import ru.igorek.addressbook.appmanager.GroupData;
import ru.igorek.addressbook.model.testbase;

public class GroupModification extends testbase {
    @Test
    public void testGroupModification(){
        app.getGroupHelper().chooseGroups();
        app.getGroupHelper().initGroupMod();
        app.getGroupHelper().fillGroup(new GroupData("222", "dd", "ff"));
        app.getGroupHelper().initUpdate();
    }
}
