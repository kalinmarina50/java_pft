package ru.stqa.pft.testmodule.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.testmodule.model.GroupFormDate;


public class GroupHelper extends HelperBase {

    private By name;

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        click(By.linkText("group page"));
    }

    public void submitGroupForm() {
        click(By.name("submit"));
    }

    public void fillOutGroupForm(GroupFormDate groupFormDate) {
        type(By.name("group_name"), groupFormDate.getName());
        type(By.name("group_header"), groupFormDate.getHeader());
        type(By.name("group_footer"), groupFormDate.getFooter());
    }

    public void initGroupCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void selectGroup(int index) {
        wd.findElements(By.name("selected[]")).get(index).click();
        click(By.name("selected[]"));
    }

    public void selectElement() { click(By.name("selected[]"));}


    public void selectGroup() {
        if (!wd.findElement(By.name("selected[]")).isSelected()) {
            click(By.name("selected[]"));
        }
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }

    public void createGroup(GroupFormDate group) {
        initGroupCreation();
        fillOutGroupForm(group);
        submitGroupForm();
        returnToGroupPage();
    }

    public boolean isThereGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    private boolean isElementPresent(By name) {
        this.name = name;
        return true;
    }


    public int getGroupCount() {
       return wd.findElements(By.name("selected[]")).size();
    }
}
