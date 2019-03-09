package com.kodilla.spring.calculator;

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
public class CalculatorTestSuit {

    @Test
    public void testCalculations(){
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
                //when
        double add = calculator.add(2,6);
        double div = calculator.div(4,1);
        double mul = calculator.mul(2,8);
        double sub = calculator.sub(2,2);
        //then
        Assert.assertEquals(8,add,0);
        Assert.assertEquals(4,div,0);
        Assert.assertEquals(16,mul,0);
        Assert.assertEquals(0,sub,0);
    }
}
