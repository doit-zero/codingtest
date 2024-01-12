package DesingPattern.AdapterPattern;

public class Fish implements Walkable{

    @Override
    public void walk() {
        System.out.println("물고기가 헤엄친다.");
        System.out.println("이게 상속의 강력함 개방폐쇠원칙이며 이 원칙을 지킨 패턴 중 하나나 어댑터패턴이다 이 말씀");
    }
}
