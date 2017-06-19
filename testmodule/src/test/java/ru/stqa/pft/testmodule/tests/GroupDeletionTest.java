package ru.stqa.pft.testmodule.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.testmodule.model.GroupFormDate;

public class GroupDeletionTest extends TestBase {

    
    @Test
    public void groupDeletionTest() {

        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        //if (app.getGroupHelper().isThereGroup() == true) {
        //    app.getGroupHelper().selectElement();
        //    app.getGroupHelper().deleteSelectedGroups();
        //}
        //app.getGroupHelper().selectElement();
        //app.getGroupHelper().deleteSelectedGroups();
        //    app.getGroupHelper().returnToGroupPage();
        if (! app.getGroupHelper().isThereGroup()) {
            app.getGroupHelper().createGroup(new GroupFormDate("test1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before -1);
    }
    }


