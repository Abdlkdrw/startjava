public class Calculator {
    public void calculate(int firstNum, int secondNum, char operation) {
        int calculate = 1; 
        switch(operation) {
            case '+':
                calculate = firstNum + secondNum;
                break;  
            case '-':
                calculate = firstNum - secondNum;
                break;
            case '*':
                calculate = firstNum * secondNum;
                break;
            case '/':
                calculate = firstNum / secondNum;
                break;
            case '^':
                for(int i = 0; i < secondNum; i++) {
                    calculate = calculate * firstNum;
                }
                break; 
            case '%':
                calculate = firstNum % secondNum;
                break;  
            default:
                System.out.println("Введённая математическая операция не поддерживается!");
                return;
        }
        System.out.println("Результат вычислений = " + calculate);
    }
}