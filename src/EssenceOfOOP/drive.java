package EssenceOfOOP;

public class drive {
    public static void main(String[] args){
        Elise elise = new Elise();
        Baberage baberage = new Baberage();
        Elise b = elise;

        System.out.println("//메세지 전달 전 //");
        System.out.println(elise.getKey());
        System.out.println(baberage.getYang());

        elise.drinkBaberage(baberage);

        System.out.println("//메세지 전달 후 //");

        System.out.println(elise.getKey());
        System.out.println(baberage.getYang());

        System.out.println("// 동일성 비교 //");
        System.out.println(b==elise);
        System.out.println(b.equals(elise));

        Student student1 = new Student("S001", "Alice");
        Student student2 = new Student("S002", "Bob");
        Student student3 = new Student("S001", "Alice");
        Student student4 = student1;

        // equals 메서드를 사용하여 동등성 비교
        System.out.println("student1 equals student2: " + student1.equals(student2));  // false
        System.out.println("student1 equals student3: " + student1.equals(student3));  // true

        // == 을 사용하여 동일성 비교
        System.out.println("student1 equals student3: " + (student1 == student3)); // false
        System.out.println("student1 equals student4: " + (student1 == student4)); // true


        // hashCode 값 출력
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student2 hashCode: " + student2.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode());
        System.out.println("student4 hashCode: " + student4.hashCode());

        Integer x = 3;
        Integer y = 3;
        int z = 3;
        System.out.println(x==y); // 참조타입을 비교하기 때문에 객체의 주소값을 비교함 그래서 false
        System.out.println(x==z); // 기본데이터 타입이므로 값을 비교하기 때문에 자동으로 언박싱한 값을 비교하기 때문에 true
        System.out.println(y==z); // 기본데이터 타입이므로 값을 비교하기 때문에 자동으로 언박싱한 값을 비교하기 때문에 true
        System.out.println(x.equals(y)); // 객체의 상태의 값을 비교해주기 때문에 true가 나오는 것이다.

        String m = new String("테스트");
        String n = new String("테스트");

        System.out.println(m==n); // 참조 타입 변수가 가리키는 주소값들이 다르므로 false
        System.out.println(m.equals(n)); // 참조 타입 변수가 가리키는 객체 상태의 값이 같으므로 true

        String r = "테스트";
        String t = "테스트";

        System.out.println(r==t); // 참조 타입 변수가 가리키는 주소 값들이 같은! heap영역에 constant pool에 생성되었기 때문!
        System.out.println(r.equals(t)); // 참조 타입 변수가 가리키는 객체 상태의 값이 같으므로 당연히 true

        for(int i = 0; i <10; i++){
            String stringTest = new String("안녕하세요");
            System.out.println(i + " " + stringTest);
        }

        for(int i = 0; i <10; i++){
            String stringTest ="안녕하세요";
            System.out.println(i + " " + stringTest);
        }


    }
}
