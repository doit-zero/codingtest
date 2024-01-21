package DI;
public class Sword {
    private String name;
    private int power = 100;

    public Sword(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
}
