package ru.igorek.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
    @Test
    public void testCube(){
        Cube s = new Cube(5);
        Assert.assertEquals(s.cube(),25);

    }
    @Test
    public void testPoint(){
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Assert.assertEquals(p2.distance(p1,p2),2.8284271247461903);
    }
}
