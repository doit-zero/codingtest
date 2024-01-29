package thread;

public class Bank {
    private int balance = 0;

    // 입금 메서드 (스레드 세이프)
    public void deposit(int amount) {
        balance += amount;
        System.out.println("입금: " + amount + ", 현재 잔액: " + balance);
    }

    // 출금 메서드 (스레드 세이프)
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("출금: " + amount + ", 현재 잔액: " + balance);
        } else {
            System.out.println("잔액 부족, 출금 불가");
        }
    }

    // 잔액 조회 메서드 (스레드 세이프)
    public synchronized int getBalance() {
        return balance;
    }
}
