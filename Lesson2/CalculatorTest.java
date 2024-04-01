import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Введите первое число: ");
            int firstNum = scan.nextInt();
            System.out.print("Введите знак математической операции: ");
            String mathOperation = scan.next();
            System.out.print("Введите второе число: ");
            int secondNum = scan.nextInt();
            Calculator calc = new Calculator();
            calc.calculate(firstNum, secondNum, mathOperation);
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.next();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}