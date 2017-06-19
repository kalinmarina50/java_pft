package ru.stqa.pft.testmodule.tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.testmodule.model.GroupFormDate;


public class GroupCreationTest extends TestBase {

    @Test
    public void groupCreationTest() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().createGroup(new GroupFormDate("test3", null, null));
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before + 1);
    }

}
