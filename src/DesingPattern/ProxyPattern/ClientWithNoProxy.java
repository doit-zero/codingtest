package DesingPattern.ProxyPattern;

public class ClientWithNoProxy {
    public static void main(String[] args) {
        Iservice proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
}
