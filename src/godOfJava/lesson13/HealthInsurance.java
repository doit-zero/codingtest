package godOfJava.lesson13;

public enum HealthInsurance {

    LEVEL_ONE(1000,0.01),
    LEVEL_TOW(2000,0.02),
    LEVEL_THREE(3000,0.032),
    LEVEL_FOUR(4000,0.045);

    private final int maxSalary;
    private final double ratio;

    HealthInsurance(int maxSalary, double ratio) {
        this.maxSalary = maxSalary;
        this.ratio = ratio;
    }
    public double getRatio() {
        return ratio;
    }

    public static HealthInsurance getHealthInsurance(int salary){
        if(salary <= LEVEL_ONE.maxSalary){
            return LEVEL_ONE;
        } else if (salary <= LEVEL_TOW.maxSalary) {
            return LEVEL_TOW;
        } else if (salary <= LEVEL_THREE.maxSalary){
            return LEVEL_THREE;
        } else {
            return LEVEL_FOUR;
        }
    }
}
