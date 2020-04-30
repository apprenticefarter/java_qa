package ru.igorek.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.igorek.addressbook.model.GroupData;
import ru.igorek.addressbook.model.TestBase;

import java.util.HashSet;
import java.util.List;

public class groupModification extends TestBase {
    @Test
    public void testGroupModification() {
        app.getGroupHelper().chooseGroups();

        if (!app.getGroupHelper().chekGroupExistance()) {
            app.getGroupHelper().createGroup(new GroupData("222", null, null));
            app.getGroupHelper().chooseGroups();
        }
        //int before = app.getGroupHelper().countGroups();
        List<GroupData> before = app.getGroupHelper().getGroupList();

        app.getGroupHelper().chooseGrouptoEdit(0);
        app.getGroupHelper().initGroupMod();
        app.getGroupHelper().fillGroup(new GroupData("HHHHH", null, null));
        app.getGroupHelper().initUpdate();
        app.getGroupHelper().chooseGroups();
        // int after = app.getGroupHelper().countGroups();
        //Assert.assertEquals(after,before);
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());
        String id = before.get(0).getId();
        before.remove(0);
        before.add(new GroupData(id,"HHHHH", null, null));
        Assert.assertEquals(new HashSet<Object>(before),new HashSet<Object>(after));

    }
}
