import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Введите первое число: ");
            calc.setFirstNum(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setMathOperation(scan.next());
            System.out.print("Введите второе число: ");
            calc.setSecondNum(scan.nextInt());
            calc.calculate();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}