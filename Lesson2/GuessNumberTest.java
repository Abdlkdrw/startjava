import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        Player firstPlayer = new Player();
        Player secondPlayer = new Player();
        GuessNumber gNum = new GuessNumber(firstPlayer, secondPlayer);
        String answer;
        do {
            gNum.game();
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while (answer.equals("yes"));
    }
}