package ru.igorek.addressbook.model;


import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.*;
import ru.igorek.addressbook.appmanager.ApplicationManager;

public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @BeforeMethod
    public void setUp() {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
