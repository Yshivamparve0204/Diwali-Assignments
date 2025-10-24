package com.shivam.study;

import java.util.Scanner;

import static com.shivam.study.Calculator.*;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter first number");
            int num1 = sc.nextInt();
            System.out.println("enter second number");
            int num2 = sc.nextInt();
            System.out.println("addition is: "+Calculator.calculate(num1,num2,"+"));
            System.out.println("division is: "+Calculator.calculate(num1,num2,"/"));
            System.out.println("result is: "+Calculator.calculate(num1,num2,"$"));

        }catch(WrongOperatorException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
