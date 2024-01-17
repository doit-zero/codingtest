package Exam;



public class Exam {
    public static void main(String[] args){

        Car car1 = new Car("벤츠");
        Car car2 = new Car("모닝");

        swap(car1,car2);

        System.out.println("//함수에서는 매개변수가 값을 복사만 것임을 알 수 있음. 따라서 car1과 car2의 가리키는 값에 변화가 없음//");
        System.out.println("결과는 바뀌지 않음  car1 벤츠 : " + car1); // 결과는 바뀌지 않음  car1 벤츠 : 벤츠
        System.out.println("결과는 바뀌지 않음 car2 모닝 : " + car2);  // 결과는 바뀌지 않음 car2 모닝 : 모닝

        Car temp;
        temp = car1; // temp에 car1이 가리키는 객체의 주소값이 할당됨
        car1 = car2; // car1에는 car2가 가리키네는 객체의 주소값이 할당됨
        car2 = temp; // car2에는 temp가 가리키는 객체의 주소값이 할당됨

        System.out.println("// 메소드에서 매개변수가 값을 복사 받는 것이 아닌 직접 값을 변경 ///");

        System.out.println("결과는 바뀜! 원래는 car1 벤츠 : " + car1);
        System.out.println("결과 바뀜! 원래는 car2 모닝 : "+ car2);


    }

    public static void swap(Car c1 , Car c2) {
        Car temp;
        temp = c1;
        c1 = c2;
        c2 = temp;
    }


}
