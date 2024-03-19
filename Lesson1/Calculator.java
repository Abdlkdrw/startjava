public class Calculator {
    public static void main(String[] args) {
        int firstNum = 167;
        int secondNum = 81;
        char mathOperation = '%';
        if(mathOperation == '+') {
            System.out.println(firstNum + secondNum);
        } else if(mathOperation == '-') {
            System.out.println(firstNum - secondNum);
        } else if(mathOperation == '*') {
            System.out.println(firstNum * secondNum);
        } else if(mathOperation == '/') {
            System.out.println(firstNum / secondNum);
        } else if(mathOperation == '^') {
            int result = 1;
            for(int i = 0; i < secondNum; i++) {
                result = result * firstNum;
            }
            System.out.println(result);
        } else if(mathOperation == '%') {
            System.out.println(firstNum % secondNum);
        }
    }
}