package DesingPattern.Strategy;

public class Client {
    public static void main(String[] args){
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        // 총을 rambo에게 전달하여 전투 수행
        strategy = new StrategyGun();
        rambo.runContext(strategy);

        System.out.println();

        // 검을 전달하여 전투수행
        strategy = new StrategySword();
        rambo.runContext(strategy);

    }
}
