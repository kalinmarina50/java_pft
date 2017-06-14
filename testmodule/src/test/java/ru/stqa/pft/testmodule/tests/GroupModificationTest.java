package ru.stqa.pft.testmodule.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.testmodule.model.GroupFormDate;


public class GroupModificationTest extends TestBase {

    @Test
    public void groupModificationTest() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillOutGroupForm(new GroupFormDate("groupNumber3", "New group creation completed", "new group creation successful"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }
}
