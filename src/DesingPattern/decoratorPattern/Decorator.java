package DesingPattern.decoratorPattern;

public class Decorator implements Iservice {
    Iservice service1;
    public String runSomething() {
        service1 = new Service();
        return "이것은 데코레이터 패턴~ " + service1.runSomething();
    }


}
