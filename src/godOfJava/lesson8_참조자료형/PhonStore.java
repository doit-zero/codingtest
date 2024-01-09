package godOfJava.lesson8_참조자료형;

public class PhonStore {
    public static void main(String[] args){

        PhoneNumber phoneNumber1 = new PhoneNumber("222-3333");
        PhoneNumber phoneNumber2 = new PhoneNumber("3333-2222");
        PhoneNumber phoneNumber3 = new PhoneNumber("3333-4444");

        System.out.println(phoneNumber1.getPhoneNumber());
        System.out.println(phoneNumber2.getPhoneNumber());
        System.out.println(phoneNumber3.getPhoneNumber());

        // 고객의 요청으로 앞자리만 011로 변경
        phoneNumber1.setPreNumber("011");

        System.out.println(phoneNumber1.getPhoneNumber());
        System.out.println(phoneNumber2.getPhoneNumber());
        System.out.println(phoneNumber3.getPhoneNumber());

        // static 변수 변경 후 인스턴스 생성
        PhoneNumber phoneNumber4 = new PhoneNumber("4444-5555");
        System.out.println(phoneNumber4.getPhoneNumber());
    }
}
