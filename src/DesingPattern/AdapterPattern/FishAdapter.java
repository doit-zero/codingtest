package DesingPattern.AdapterPattern;

public class FishAdapter extends Animal{
    Fish fish = new Fish();
    @Override
    void walk() {
        fish.walk();
    }
}
