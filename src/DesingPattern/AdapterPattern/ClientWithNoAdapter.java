package DesingPattern.AdapterPattern;

public class ClientWithNoAdapter {
    public static void main(String[] args) {
        AdapterServiceA adapterServiceA = new AdapterServiceA();
        AdapterServiceB adapterServiceB = new AdapterServiceB();

        adapterServiceA.runService();
        adapterServiceB.runService();
    }
}
