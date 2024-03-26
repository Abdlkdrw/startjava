import java.lang.Math;
import java.util.Scanner;

public class GuessNumber {
    
    Scanner scan = new Scanner(System.in);
    private Player firstPlayer;
    private Player secondPlayer;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void game() {
        boolean isWin = false;
        int randomNum = (int) (Math.random() * 100) + 1;
        do {
            System.out.print(firstPlayer.getName() + ", введите число: ");
            int firstPlayerNum = scan.nextInt();
            if (firstPlayerNum == randomNum) {
                isWin = true;
                System.out.println("Поздравляю! " + firstPlayer.getName() + " выиграл! Это число " + randomNum);
                break;
            } else if(firstPlayerNum > randomNum) {
                System.out.println("Число " + firstPlayerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + firstPlayerNum + " меньше того, что загадал компьютер");
            }
            System.out.print(secondPlayer.getName() + ", введите число: ");
            int secondPlayerNum = scan.nextInt();
            if (secondPlayerNum == randomNum) {
                isWin = true;
                System.out.println("Поздравляю! " + secondPlayer.getName() + " выиграл! Это число " + randomNum);
                break;
            } else if(secondPlayerNum > randomNum) {
                System.out.println("Число " + secondPlayerNum + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + secondPlayerNum + " меньше того, что загадал компьютер");
            }
        } while (!isWin); 
    }
}