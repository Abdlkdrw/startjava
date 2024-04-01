public class Person {
   
    String gender = "Man";
    String name = "Nurulla";
    float height = 1.83f;
    float weight = 74.4f;
    int age = 19; 

    String go() {
        return "Пройдено 2 шага";
    }

    boolean seat() {
        return false;
    }

    void run() {
        System.out.println("Пробежать 100 м");
    }

    String speak() {
        return "My name is " + name; 
    }

    boolean learnJava() {
        return true;
    }
}