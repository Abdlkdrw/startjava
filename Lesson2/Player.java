import java.util.Scanner;

public class Player {
    private String name;
    Scanner scan = new Scanner(System.in);

    public Player() {
        System.out.print("Введите имя игрока: ");
        String name = scan.nextLine();
        this.name = name;
    }

    public String getName() {
        return name;
    }
}