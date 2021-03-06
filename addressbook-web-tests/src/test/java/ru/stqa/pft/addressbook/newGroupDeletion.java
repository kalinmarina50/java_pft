package ru.stqa.pft.addressbook;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class newGroupDeletion {
    FirefoxDriver wd;

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void newGroupDeletion() {
        wd.get("http://localhost/addressbook/index.php");
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys("admin");
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys("secret");
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        wd.findElement(By.linkText("groups")).click();

            if (wd.findElement(By.name("selected[]")).isDisplayed()) {
                //wd.findElement(By.name("new")).click();
                //wd.findElement(By.linkText("groups")).click();
                if (!wd.findElement(By.name("selected[]")).isSelected()) {
                    wd.findElement(By.name("selected[]")).click();
                }
                wd.findElement(By.name("delete")).click();
            }
          {

            //if (!wd.findElement(By.name("selected[]")).isSelected()) {
            //    wd.findElement(By.name("selected[]")).click();
            wd.findElement(By.linkText("groups")).click();
            wd.quit();
        }
            //wd.findElement(By.name("delete")).click();
        }
            //wd.findElement(By.linkText("groups")).click();

    public boolean isThereGroup() {
        return isElementPresent(By.name("selected[]"));
    }

    public boolean isElementPresent(By name) {
        this.name = name;
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
