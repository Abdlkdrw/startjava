public class Wolf {
    
    String gender;
    String name;
    float weight;
    int age;
    String color;

    void toGo() {
        System.out.println("Идёт");
    }

    void toSeat() {
        System.out.println("Сидит");
    }

    void toRun() {
        System.out.println("Бежит");
    }

    String toHowl() {
        return "Воет";
    }

    void toHunting() {
        System.out.println("Охотится");
    }
}