public class Calculator {

    private int firstNum;
    private int secondNum;
    private String mathOperation;

    public int getFirstNum() {
        return firstNum;
    }
    
    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public String getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(String mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void calculate() {
        int calculate = 1;
        char symbol = mathOperation.charAt(0);
        switch(symbol) {
            case '+':
                calculate = firstNum + secondNum;
                System.out.println("Результат вычислений = " + calculate);
                break;  
            case '-':
                calculate = firstNum - secondNum;
                System.out.println("Результат вычислений = " + calculate);
                break;
            case '*':
                calculate = firstNum * secondNum;
                System.out.println("Результат вычислений = " + calculate);
                break;
            case '/':
                calculate = firstNum / secondNum;
                System.out.println("Результат вычислений = " + calculate);
                break;
            case '^':
                for(int i = 0; i < secondNum; i++) {
                    calculate = calculate * firstNum;
                }
                System.out.println("Результат вычислений = " + calculate);
                break; 
            case '%':
                calculate = firstNum % secondNum;
                System.out.println("Результат вычислений = " + calculate);
                break;  
            default:
                System.out.println("Введённая математическая операция не поддерживается!");
        }
    }
}