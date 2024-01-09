package godOfJava.lesson13;

public class InsuranceTest {
    public static void main(String[] args){
        int[] salaryArray = new int[] {100,2300,3400};
        HealthInsurance[] insurances = new HealthInsurance[3];
        insurances[0]=HealthInsurance.getHealthInsurance(salaryArray[0]);
        insurances[1]=HealthInsurance.getHealthInsurance(salaryArray[1]);
        insurances[2]=HealthInsurance.getHealthInsurance(salaryArray[2]);

        for (int loop = 0; loop < 3; loop++) {
            System.out.println("Salary: " + salaryArray[loop] +
                    ", Insurance: " + insurances[loop] +
                    ", Ratio: " + insurances[loop].getRatio());
        }
    }
}
