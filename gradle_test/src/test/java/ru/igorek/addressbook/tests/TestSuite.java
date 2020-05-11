package ru.igorek.addressbook.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


    @RunWith(Suite.class)

    @Suite.SuiteClasses({
            contactADD.class,
            contactDelete.class,
            groupADD.class,
            groupModification.class,
            groupDELETE.class
    })


    public class TestSuite {
}
