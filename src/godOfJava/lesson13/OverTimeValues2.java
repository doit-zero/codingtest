package godOfJava.lesson13;

public enum OverTimeValues2 {
    THREE_HOUR(18000,"메롱"),
    FIVE_HOUR(30000, "호롱"),
    WEEKEND_FOUR_HOUR(40000, "바로래요"),
    WEEKEND_EIGHT_HOUR(60000, "원피스~");
    private final int amount;
    private final String jj;
    OverTimeValues2(int amount, String jj) {
        this.amount = amount;
        this.jj = jj;
    }

    public String getAmount() {
        return jj+amount;
    }
}
