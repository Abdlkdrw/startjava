public class myGame {
    public static void main(String[] args) {
        int myNum = 16;
        int computerNum = 22;
        while(myNum != computerNum) {
            if(myNum > computerNum) {
                System.out.println("Ваше число " + myNum + " больше чем число компьютера!");
                myNum--;
            } else if(myNum < computerNum) {
                System.out.println("Ваше число " + myNum + " меньше чем число компьютера!");
                myNum++;
            }
            System.out.println("Вы угадали!!! Это число " + myNum);
        }
    }
}