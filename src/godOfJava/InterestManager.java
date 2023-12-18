package godOfJava;

public class InterestManager {
    public static void main(String[] args) {
        InterestManager test = new InterestManager();
        long amount = 1000000;
        double sum = 0;
        for(int day = 1 ; day <= 365 ; day+=10 ){
            double calculateAmount = test.calculateAmount(day,amount); // 예치금+이자
            sum += calculateAmount;
            System.out.println(sum);
        }
    }
    public double getInterestRate(int day){
        if(1 <= day && day <= 90) {
            return 0.005 ;
        } else if (91 <= day && day <= 180) {
            return 0.01;
        } else if (181 <= day && day <= 364) {
            return 0.02;
        }
        return 0.056;
    }

    public double calculateAmount(int day, long amount) {
        InterestManager interestManager = new InterestManager();
        double interestRate = interestManager.getInterestRate(day); // 이자율
        return amount*interestRate;
    }
}