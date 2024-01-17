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
    }
}
