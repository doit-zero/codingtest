package DesingPattern.AdapterPattern;

public class AdapterServiceB {
    ServiceB sb1 = new ServiceB();
    void runService(){
        sb1.runServiceB();
    }
}
