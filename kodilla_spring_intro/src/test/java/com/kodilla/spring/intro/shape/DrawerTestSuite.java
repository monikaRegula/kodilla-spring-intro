package com.kodilla.spring.intro.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDoDrawingWithCircle(){
        //given
        Circle circle = new Circle();
        //when
       Drawer drawer = new Drawer(circle);
       String result = drawer.doDrawing();
        //then
        Assert.assertEquals("Circle",result);
    }


    @Test
    public void testDoDrawingWithTriangle(){
       //given
        Triangle triangle = new Triangle();
        //when
        Drawer drawer =new Drawer(triangle);
        String result = drawer.doDrawing();
        //then
        Assert.assertEquals("Triangle",result);
    }
}
