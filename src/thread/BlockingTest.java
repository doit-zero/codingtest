package thread;

public class BlockingTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();

        // thread가 종료될 때까지 기다림
        thread.join();

        System.out.println("thread 종료");
    }
}

