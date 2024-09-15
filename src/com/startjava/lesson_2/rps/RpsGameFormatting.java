package com.startjava.lesson_2.rps;

import java.util.Scanner;
import java.util.Random;

    // Игра Камень-Ножницы-Бумага
public class RpsGameFormatting {

    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        String firstPlayer = inputName(scan);
        String secondPlayer = inputName(scan);

        // Ход первого игрока
        int position = generatePosition(firstPlayer, r);
        String sign1 = defineSign(position);
        showSigns(sign1);

        // Ход второго игрока
        position = generatePosition(secondPlayer, r);
        String sign2 = defineSign(position);
        showSigns(sign2);

        defineWinner(firstPlayer, sign1, secondPlayer, sign2);
    }

    private static final String ROCK = "R";
    private static final String SCISSORS = "S";
    private static final String PAPER = "P";

    private static String inputName(Scanner scan) {
        System.out.print("Введите имя игрока: ");
        return scan.nextLine();
    }

    private static int generatePosition(String player, Random r) {
        System.out.println("Ход " + player + ": ");
        return r.nextInt(1, 100);
    }

    private static String defineSign(int position) {
        String sign = ROCK;
        if(position > 66) {
            sign = ROCK;
        } else if(position < 33) {
            sign = SCISSORS;
        } else {
            sign = PAPER;
        }
        return sign;
    }

    private static void showSigns(String sign) throws InterruptedException {
        for(int i = 0; i < 5; i++) {
            System.out.print(ROCK + "\r");
            Thread.sleep(200);
            System.out.print(SCISSORS + "\r");
            Thread.sleep(200);
            System.out.print(PAPER + "\r");
            Thread.sleep(200);
        }
        System.out.println(sign);
    }

    private static void defineWinner(String firstPlayer, String sign1, String secondPlayer, String sign2) {
        if(sign1.equals(sign2)) {
            System.out.println("\nПобедила дружба!");
            return;
        }
        boolean isEqualName1 = sign1.equals(ROCK) && sign2.equals(SCISSORS) || sign1.equals(SCISSORS) 
                               && sign2.equals(PAPER) || sign1.equals(PAPER) && sign2.equals(ROCK);
        if(isEqualName1) {
            System.out.println("\nПобедил - " + firstPlayer);
        } else {
            System.out.println("\nПобедил - " + secondPlayer);
        }
    }
}