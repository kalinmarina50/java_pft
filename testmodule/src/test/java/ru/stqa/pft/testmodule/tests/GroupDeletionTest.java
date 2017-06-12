package ru.stqa.pft.testmodule.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    
    @Test
    public void groupDeletionTest() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returnToGroupPage();
    }

}
