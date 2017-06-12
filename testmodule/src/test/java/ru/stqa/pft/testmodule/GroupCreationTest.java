package ru.stqa.pft.testmodule;


import org.testng.annotations.Test;


public class GroupCreationTest extends TestBase {

    @Test
    public void groupCreationTest() {
        gotoGroupPage();
        initGroupCreation();
        fillOutGroupForm(new GroupFormDate("newgroup", "created new group", "new group creation success"));
        submitGroupForm();
        returnToGroupPage();
    }

}
