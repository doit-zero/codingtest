package EssenceOfOOP;

public class Elise {
    private int key = 180;
    private String location;

    private Baberage baberage;

    public void drinkBaberage(Baberage baberage) {
        baberage.drinked(20);
        this.key -= 100;
    }

    public int getKey() {
        return key;
    }

    public String getLocation() {
        return location;
    }

}
