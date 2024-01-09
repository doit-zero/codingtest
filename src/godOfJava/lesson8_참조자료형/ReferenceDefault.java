package godOfJava.lesson8_참조자료형;

import java.util.Arrays;

public class ReferenceDefault {
    public static void main(String[] args){
        ReferenceDefault referenceDefault = new ReferenceDefault();
        System.out.println(referenceDefault.intReturn());
        System.out.println(Arrays.toString(referenceDefault.intArrayReturn()));

    }

    public int intReturn() {
        int intReturn = 0 ;
        return intReturn;
    }

    public int[] intArrayReturn(){
        int[] array = new int[]{11,22,33};
        return array;
    }

}