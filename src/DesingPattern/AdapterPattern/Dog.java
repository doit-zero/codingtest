package DesingPattern.AdapterPattern;

public class Dog implements Walkable{

    @Override
    public void walk() {
        System.out.println("개가 걷는다");
        System.out.println("이렇게 확장된 클래스는 마음껏 변경해도 됨");
    }
}
