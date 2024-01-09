package godOfJava.lesson8_참조자료형;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO(String name) {
        this.name = name;
    }

    public MemberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public MemberDTO() {

    }
}
