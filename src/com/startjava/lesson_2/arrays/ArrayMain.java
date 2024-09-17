package com.startjava.lesson_2.arrays;

public class ArrayMain {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        int[] numbers2 = {2, 6, 5};

        for(int i = 0; i < numbers2.length; i++) {
            numbers[i] = numbers2[i];
        }
    }
}
