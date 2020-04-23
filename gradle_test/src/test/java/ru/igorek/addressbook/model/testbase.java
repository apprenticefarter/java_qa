package ru.igorek.addressbook.model;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.BrowserType;
import ru.igorek.addressbook.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

}
