package Inherite;

public class Man {
    protected String name = "333";
    protected String age;

    public void sayMyName() {
        System.out.println("내 이름은 : " + this.name);
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }


}
