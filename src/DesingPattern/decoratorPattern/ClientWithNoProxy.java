package DesingPattern.decoratorPattern;

public class ClientWithNoProxy {
    public static void main(String[] args) {
        Iservice decorator = new Decorator();
        System.out.println(decorator.runSomething());
    }
}
