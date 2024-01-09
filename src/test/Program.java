package test;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        GList<Integer> list = new GList<>();
        list.add(3);
        list.add(5);


        System.out.println(Arrays.toString(list.getArray()));
    }
}
