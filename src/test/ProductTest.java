package test;

import java.util.HashMap;

public class ProductTest {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public ProductTest() {
    }

    public static void main(String[] args){
        int salaryArray[] = new int[]{900,1000,1800};
        HealthInsurance[] insurances = new HealthInsurance[3];
        insurances[0] = HealthInsurance.getHealthInsurance(salaryArray[0]);
        insurances[1] = HealthInsurance.getHealthInsurance(salaryArray[1]);
        insurances[2] = HealthInsurance.getHealthInsurance(salaryArray[2]);

        System.out.println(insurances[0]);
        System.out.println(insurances[0].getRatio());

        ProductTest.hashCodeTest("테스트");
        ProductTest.hashCodeTest("기러기");
        ProductTest.hashCodeTest("테스트");
        ProductTest.hashCodeTest("ㄴㄹㅈㄷㄹㄷㅈㄹㄷㅈㄹ");
    }

    public static void hashCodeTest(String s){
        System.out.println(s.hashCode());
    }

}
