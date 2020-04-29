package ru.igorek.addressbook.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.igorek.addressbook.model.GroupData;
import ru.igorek.addressbook.model.TestBase;

public class groupModification extends TestBase {
    @Test
    public void testGroupModification(){
        app.getGroupHelper().chooseGroups();

        if(! app.getGroupHelper().chekGroupExistance()){
            app.getGroupHelper().createGroup(new GroupData("222", null, null));
            app.getGroupHelper().chooseGroups();
        }
        int before = app.getGroupHelper().countGroups();

        app.getGroupHelper().chooseGrouptoEdit(before -1);
        app.getGroupHelper().initGroupMod();
        app.getGroupHelper().fillGroup(new GroupData("HHHHH", null, null));
        app.getGroupHelper().initUpdate();
        app.getGroupHelper().chooseGroups();
        int after = app.getGroupHelper().countGroups();
        Assert.assertEquals(after,before);

    }
}
