public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "Male";
        wolf.name = "Volk";
        wolf.weight = 42.29f;
        wolf.age = 10;
        wolf.color = "Black";

        System.out.println(wolf.weight);
        System.out.println(wolf.color);
        wolf.toSeat();
        System.out.println("Волк по имени " + wolf.name + " " + wolf.toHowl());
    }
}