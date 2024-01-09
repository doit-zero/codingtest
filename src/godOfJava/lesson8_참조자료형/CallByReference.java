package godOfJava.lesson8_참조자료형;

public class CallByReference {
    int a = 10 ;
    public static void main(String[] args){
        CallByReference callByReference = new CallByReference();
        //
        System.out.println(callByReference.a);

        callByReference.callByRe(callByReference);

        System.out.println(callByReference.a);
    }

    public void callByRe(CallByReference x) {
        x.a = 20;
        System.out.println(x.a);
    }

}
