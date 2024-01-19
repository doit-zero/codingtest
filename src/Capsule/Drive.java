package Capsule;

public class Drive {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("joon",10000);
        BankAccount bankAccount2 = new BankAccount("Bo",200000);

        System.out.println("bankAccount1의 계좌 : " + bankAccount1.getBalance());
        System.out.println("bankAccount2의 계좌 : " + bankAccount2.getBalance());

        System.out.println("//1 -> 2로 돈 송금//");
        bankAccount1.submitMoney(3000);
        bankAccount2.getMoney(3000);

        System.out.println("bankAccount1의 계좌 : " + bankAccount1.getBalance());
        System.out.println("bankAccount2의 계좌 : " + bankAccount2.getBalance());

    }
}
