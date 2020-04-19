package ru.igorek.addressbook.model;

import org.junit.After;
import org.junit.Before;
import ru.igorek.addressbook.appmanager.applicationManager;

public class testbase {

    protected final applicationManager app = new applicationManager();

    @Before
    public void setUp() {
        app.init();
    }

    @After
    public void tearDown() {
        app.stop();
    }

}
