public class Person {
   
    String gender = "Man";
    String name = "Nurulla";
    float height = 1.83f;
    float weight = 74.4f;
    int age = 19; 

    String toGo() {
        return "Пройдено 2 шага";
    }

    boolean toSeat() {
        return false;
    }

    void toRun() {
        System.out.println("Пробежать 100 м");
    }

    String toSpeak() {
        return "My name is " + name; 
    }

    boolean toLearnJava() {
        return true;
    }
}