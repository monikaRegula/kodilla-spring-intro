package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired//wstrzykiwanie zależności przez pole klasy
    private Display display;

    public double add(double a,double b){
        double sum= a+b;
        display.displayValue(sum);
        return sum;
    }

    public double sub(double a,double b){
        double sub = a-b;
        display.displayValue(sub);
        return sub;
    }
    public double mul(double a,double b){
        double sub = a*b;
        display.displayValue(sub);
        return sub;
    }
    public double div(double a,double b){
        double sub = a/b;
        display.displayValue(sub);
        return sub;
    }


//    public static void main(String[] args) {
//        ExpressionExecute expressionExecute = new ExpressionExecute();
//        expressionExecute.executeExpression(4,5,(a,b) -> a+b );
//    }



}
