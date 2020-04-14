package ru.igorek.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
    @Test
    public void testCube(){
        Cube s = new Cube(5);
        Assert.assertEquals(s.cube(),25);

    }
}
