package com.startjava.lesson_2.robot;

import com.startjava.lesson_2.robot.Jaeger;

public class JaegerTest {
    public static void main(String[] args) {

        Jaeger typhoon = new Jaeger();
        typhoon.setModelName("Crimson Typhoon");
        typhoon.setMark("Mark-4");
        typhoon.setOrigin("China");
        typhoon.setHeight(76.2f);
        typhoon.setWeight(38.900f);
        typhoon.setSpeed(9);
        typhoon.setStrength(8);
        typhoon.setArmor(6);

        System.out.println("Model name: " + typhoon.getModelName() + "\nOrigin: " + typhoon.getOrigin()
                           + "\nHeight: " + typhoon.getHeight() + "\nWeight: " + typhoon.getWeight());
    
        Jaeger eureka = new Jaeger("Striker Eureka", "Australia", 76.2f, 41.792f);

        System.out.println("Model name: " + eureka.getModelName() + "\nOrigin: " + eureka.getOrigin()
                           + "\nHeight: " + eureka.getHeight() + "\nWeight: " + eureka.getWeight());
    
        typhoon.goToVictoriaHarbour();
    }
}