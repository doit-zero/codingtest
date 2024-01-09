package godOfJava.lesson13;

public class OverTimeManager {
    public int getOverTimeAmount(OverTimeValues value){
        int amount = 0;
        System.out.println(value);
        switch (value) {
            case THREE_HOUR:
                amount = 1800;
                break;
            case FIVE_HOUR:
                amount = 3000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount = 4000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount = 6000;
                break;
        }
    return amount;
    }
}
