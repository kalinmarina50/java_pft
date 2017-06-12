package ru.stqa.pft.testmodule;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    
    @Test
    public void groupDeletionTest() {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroups();
        returnToGroupPage();
    }

}
