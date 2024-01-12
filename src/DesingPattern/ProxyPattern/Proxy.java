package DesingPattern.ProxyPattern;

public class Proxy implements Iservice{
    Iservice service1;
    public String runSomething() {
        service1 = new Service();
        return service1.runSomething();
    }


}
