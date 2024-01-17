package EssenceOfOOP;

public class Baberage {
    private int yang;

    public int drinked(int yang){
        return this.yang -= yang;
    }

    public int getYang() {
        return yang;
    }
}
