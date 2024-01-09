package thread;

public class MainThread {
    public static void main(String[] args){
        Thread thread = new ThreadA();
        thread.start(); // start는 Run 메소드를 실행시키라는 의미
        for(int i = 0; i < 1000; i++){
            System.out.println("main = " +i);
        }
    }
}
