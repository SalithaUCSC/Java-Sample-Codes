package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    class Container<T> {

    }

    public static void main(String[] args) {
//        Container<Integer> container = new Container<>();
        List list = new ArrayList();
        list.add("ddd");
        list.add(3);
        System.out.println(list.get(1));
    }
}


