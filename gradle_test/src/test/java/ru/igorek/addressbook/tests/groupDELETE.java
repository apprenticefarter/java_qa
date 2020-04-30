package ru.igorek.addressbook.tests;// Generated by Selenium IDE
import org.junit.Assert;
import org.junit.Test;
import ru.igorek.addressbook.model.GroupData;
import ru.igorek.addressbook.model.TestBase;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

public class groupDELETE extends TestBase {


  @Test
  public void deleteGroup() {

    app.getGroupHelper().chooseGroups();

    if(! app.getGroupHelper().chekGroupExistance()){
      app.getGroupHelper().createGroup(new GroupData("222", null, null));
      app.getGroupHelper().chooseGroups();
    }
    //int before = app.getGroupHelper().countGroups();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().chooseGrouptoEdit(0);
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().chooseGroups();

    //int after = app.getGroupHelper().countGroups();
   // Assert.assertEquals(after, before -1);
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() -1);

    before.remove(0);
    Assert.assertEquals(after,before);

  }

}
