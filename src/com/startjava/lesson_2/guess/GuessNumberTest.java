package com.startjava.lesson_2.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String firstPlayerName = scan.nextLine();
        Player firstPlayer = new Player(firstPlayerName);

        System.out.print("Введите имя второго игрока: ");
        String secondPlayerName = scan.nextLine();
        Player secondPlayer = new Player(secondPlayerName);
        
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