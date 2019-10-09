package wrappers;

import java.util.ArrayList;

public class WrappersDemo {

    public static void main(String[] args) {

        int x = 20;
        Integer y = 20;                      // AutoBoxing
        System.out.println(x+" "+y);

        Integer a = new Integer(3);
        int b = a;                           // Unboxing
        System.out.println(a+" "+b);

        // Generic of ArrayList is a wrapper - Integer
        // But when we loop and add i th element compiler internally box the element
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

    }
}
