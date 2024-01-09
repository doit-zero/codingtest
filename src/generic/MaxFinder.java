package generic;

public class MaxFinder {

    public static void main(String[] args){
        Object[] list = new Object[10];
        list[0] = 1;
        list[1] = "테스트중";
        list[2] = 0.001;

        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }

//    public void testGetMax(){
//        System.out.println(getMax(1,2,3));
//        System.out.println(getMax(3,2,1));
//        System.out.println(getMax(2,3,1));
//        System.out.println(getMax("a","b","c"));
//        System.out.println(getMax("c","b","a"));
//        System.out.println(getMax("a","b","c"));
//    }
//
//
}
