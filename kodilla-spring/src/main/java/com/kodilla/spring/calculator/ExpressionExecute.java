package com.kodilla.spring.calculator;

public class ExpressionExecute {
    public void executeExpression(double a,double b,I_Operation i_operation){
        double result = i_operation.calculate(a,b);
        System.out.println("Result "+result);
    }
}
