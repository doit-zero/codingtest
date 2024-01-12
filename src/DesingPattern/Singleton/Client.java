package DesingPattern.Singleton;

public class Client {
    public static void main(String[] args){
        System.out.println(Singleton.singletonObject);
        Singleton st1 = Singleton.getInstance(); //
        Singleton st2 = Singleton.getInstance(); // 위에서 생성된 객체 반
        Singleton st3 = Singleton.getInstance();


        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);


        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
    }
}
