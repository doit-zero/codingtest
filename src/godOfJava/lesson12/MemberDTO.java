package godOfJava.lesson12;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString(){
        return "Name= " +name+ "Phone= " +phone+ "email= " +email;
    }
}
