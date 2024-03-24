public class Wolf {
    
    private String gender;
    private String name;
    private float weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст!");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void toGo() {
        System.out.println("идёт");
    }

    public void toSeat() {
        System.out.println("сидит");
    }

    public void toRun() {
        System.out.println("бежит");
    }

    public String toHowl() {
        return "воет";
    }

    public void toHunting() {
        System.out.println("охотится");
    }
}