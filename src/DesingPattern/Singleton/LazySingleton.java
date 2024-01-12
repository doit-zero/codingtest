package DesingPattern.Singleton;

public class LazySingleton {

    private LazySingleton() {}

    // 처음에 생기지 않음
    private static class LazyHolder{
        public static final LazySingleton SINGLETON = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return LazyHolder.SINGLETON;
    }


}
