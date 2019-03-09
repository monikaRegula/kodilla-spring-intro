package com.kodilla.spring;


import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//to mówi że przed wykonaniem testów
// należy wykonać kod klasy SpringRunner
@SpringBootTest//informuje Springa, że ten test dotyczy aplikacji
//opartej o Spring Boot
public class SpringRunnerTestSuite {

    @Test
    public void TestCircleLoadedIntoContainer() {
            //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean(Circle.class);
        //when
        String name = shape.getShapeName();
        //then
        Assert.assertEquals("This is circle",name);
    }


    @Test
    public void testTriangleLoadedIntoContainer(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Triangle.class);
        //when
        String name = shape.getShapeName();
        //then
        Assert.assertEquals("This is trianglee",name);
    }


    @Test
    public void testSquareLoadedIntoContainer(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.shape");
        Shape shape = context.getBean(Square.class);
        String name = shape.getShapeName();
        //then
        Assert.assertEquals("Square",name);
    }


    @Test
    public void testShapeLoadedIntoContainer(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.shape");
        Shape shape = (Shape) context.getBean("chosenShape");
        //when
        String name = shape.getShapeName();
        //then
        System.out.println("Chosen shape says: "+name);

    }
}
