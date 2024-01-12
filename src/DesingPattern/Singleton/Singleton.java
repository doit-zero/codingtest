package DesingPattern.Singleton;

public class Singleton {
    static Singleton singletonObject; // 원자성 문제가 발생 할 수 있음

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(singletonObject == null) {
            singletonObject = new Singleton();
        }
        return singletonObject;
    }

}
