package ru.igorek.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.igorek.addressbook.model.GroupData;
import ru.igorek.addressbook.model.TestBase;

import java.util.Comparator;
import java.util.List;

public class groupModification extends TestBase {
    @Test
    public void testGroupModification() {
        app.getGroupHelper().chooseGroups();

        if (!app.getGroupHelper().chekGroupExistance()) {
            app.getGroupHelper().createGroup(new GroupData("222", null, null));
            app.getGroupHelper().chooseGroups();
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();

        app.getGroupHelper().chooseGrouptoEdit(0);
        app.getGroupHelper().initGroupMod();
        app.getGroupHelper().fillGroup(new GroupData("HHHHH", null, null));
        app.getGroupHelper().initUpdate();
        app.getGroupHelper().chooseGroups();

        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());

        int id = before.get(0).getId();
        before.remove(0);
        before.add(new GroupData(id,"HHHHH", null, null));
        Comparator<? super GroupData> byId = Comparator.comparingInt(GroupData::getId);
        before.sort(byId);
        after.sort(byId);
        Assert.assertEquals(before,after);

    }
}
