package ru.stqa.pft.testmodule.tests;


import org.testng.annotations.Test;
import ru.stqa.pft.testmodule.model.GroupFormDate;


public class GroupCreationTest extends TestBase {

    @Test
    public void groupCreationTest() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillOutGroupForm(new GroupFormDate("groupNumber2", "New group creation completed", "new group creation successful"));
        app.getGroupHelper().submitGroupForm();
        app.getGroupHelper().returnToGroupPage();
    }

}
