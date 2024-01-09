package test;

public enum HealthInsurance {
    LEVEL_ONE(1000,0.01),
    LEVEL_TWO(2000,0.02);

    private int maxSalary;
    private double ratio;

    HealthInsurance(int maxSalary, double ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary) {
        if (salary <= LEVEL_ONE.maxSalary) {
            return LEVEL_ONE;
        } else if (salary <= LEVEL_TWO.maxSalary) {
            return LEVEL_TWO;
        } else {
            throw new IllegalArgumentException("Invalid salary: " + salary);
        }
    }
}
