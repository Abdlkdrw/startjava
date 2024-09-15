package com.startjava.lesson_2.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        String answer;
        do {
            System.out.print("Введите первое число: ");
            int firstNum = scan.nextInt();
            System.out.print("Введите знак математической операции: ");
            char operation = scan.next().charAt(0);
            System.out.print("Введите второе число: ");
            int secondNum = scan.nextInt();
            calc.calculate(firstNum, secondNum, operation);
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}