public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("Volt");
        wolf.setAge(9);
        wolf.setColor("White");
        System.out.println("Волку " + wolf.getAge() + " лет");  
        wolf.toSeat();
        System.out.println("Волк по имени " + wolf.getName() + " " + wolf.toHowl());
    }
}