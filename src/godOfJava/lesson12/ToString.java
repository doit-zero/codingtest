package godOfJava.lesson12;

public class ToString {
    public static void main(String[] args){
        ToString thisObj = new ToString();
        thisObj.toStringMethod(thisObj);
        MemberDTO memberDTO = new MemberDTO("joon","010","email");
        System.out.println(memberDTO);
    }

    public void toStringMethod(Object obj){
        System.out.println(obj);
        System.out.println(toString());
        System.out.println(this);
    }

    public String toString() {
        return "다른 값 호출~!";
    }

}

