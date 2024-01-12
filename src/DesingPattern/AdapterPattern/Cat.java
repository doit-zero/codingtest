package DesingPattern.AdapterPattern;

public class Cat implements Walkable{

    @Override
    public void walk() {
        System.out.println("고양이가 걷는다");
        System.out.println("냐옹오오오옹");
    }
}
