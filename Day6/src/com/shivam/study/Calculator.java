package com.shivam.study;

public class Calculator {
    public static int calculate(int n1,int n2,String op)throws WrongOperatorException{
    switch (op){
        case "+":{
            return n1+n2;
        }
        case "-":{
            return n1-n2;
        }
        case "*":{
            return n1*n2;
        }
        case "/":{
            if(n2==0) {
                throw new ArithmeticException("division by zero not allowed");
            }
                return n1/n2;

        }
        case "%":{
            if(n2==0) {
                throw new ArithmeticException("modulo by zero not allowed");
            }
                return n1%n2;

        }
        default:{
          throw new WrongOperatorException("wrong operator");
        }

    }
    };
}
