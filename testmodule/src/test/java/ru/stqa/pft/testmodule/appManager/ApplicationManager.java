package ru.stqa.pft.testmodule.appManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.util.concurrent.TimeUnit;


public class ApplicationManager {

    WebDriver wd;

    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private String browser;

    public ApplicationManager(String browser) {

        this.browser = browser;
    }


    public void init() {
        if (browser.equals(BrowserType.FIREFOX)) {
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        } else if (browser.equals(BrowserType.CHROME)) {
            wd = new ChromeDriver();
        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        } else if (browser.equals(BrowserType.SAFARI)) {
            wd = new SafariDriver(new SafariOptions());
        }
        wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.loginSequence("admin", "secret");
    }


    public void stop() {
        wd.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
