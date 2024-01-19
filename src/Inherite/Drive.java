package Inherite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drive {
    public static void main(String[] args){
        Man[] array = new Man[3];
        Brave brave = new Brave();
        Enemy enemy = new Enemy();
        Enemy enemy1 = new Enemy();

        array[0] = brave;
        array[1] = enemy;
        array[2] = enemy1;

        System.out.println(Arrays.toString(array));

        Child childObj = new Child(10);
        Parent parent = new Parent(40);
        // 자식 클래스에서 오버라이드한 메서드 호출
        childObj.printValue();
        parent.printValue();

        // 부모 클래스의 value를 변경
        parent.value = 20;

        // 다시 메서드 호출
        childObj.printValue();
        parent.printValue();



//
//        // 불변객체 테스트
//        String s1 = "테스트1";
//        String s2 = "테스트2";
//        String s3 = new String("테스트1");
//        String s4 = "테스트1"+"테스트2";
//
//        // 주소값 동일한지 비교
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s3.hashCode());
//        System.out.println(s4.hashCode());
//
//        // Wrapper 클래스가 만들어진 이유는 데이터를 객체로 만들기 위해서 필요했던 것이다.
//        Integer i1 = new Integer(10);
//        Integer i2 = new Integer(10);
//
//        System.out.println(i1 == i2); // 주소값이 다르므로 false이고
//        System.out.println(i1.equals(i2));
//        System.out.println(i1.hashCode());
//
//        Integer i3 = 10;
//        Integer i4 = 10;
//
//        System.out.println(i3 == i4);
//        System.out.println(i3.equals(i4));
//        System.out.println(i3.hashCode());
//        System.out.println(i4.hashCode());

    }




}
