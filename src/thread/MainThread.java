package thread;

public class MainThread {
    public static void main(String[] args){
        Bank bank = new Bank();
        //입금 스레드
        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                bank.deposit(100);
                System.out.println("입금"+i);
                try {
                    Thread.sleep(100); // 잠시 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 출금 스레드
        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                bank.withdraw(50);
                System.out.println("출금"+i);
                try {
                    Thread.sleep(100); // 잠시 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        depositThread.start();
        withdrawThread.start();





//        Thread t1 = new Thread(() -> {
//            System.out.println("Thread 1");
//        });
//
//        Thread t2 = new Thread(() -> {
//            try {
//                // t1 스레드가 종료될 때까지 대기
//                t1.join();
//                System.out.println("Thread 2");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        Thread t3 = new Thread(() -> {
//            try {
//                // t2 스레드가 종료될 때까지 대기
//                t2.join();
//                System.out.println("Thread 3");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        t1.start();
//        t2.start();
//        t3.start();

    }
}
