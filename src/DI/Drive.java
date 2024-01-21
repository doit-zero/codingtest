package DI;

public class Drive {
    public static void main(String[] args) {

        // 강한 결합
        Brave brave = new Brave();
        System.out.println(brave.getSword().getName());

        // 생성자를 통한 의존성 주입
        Sword sword = new Sword("용사의 검");
        Brave brave1 = new Brave(sword);
        System.out.println(brave1.getSword().getName());

        // 함수를 활용한 의존성 주입, 이 경우는
        Sword sword1 = new Sword("법사의 검");
        brave1.setSword(sword1);
        System.out.println(brave1.getSword().getName());
    }
}
