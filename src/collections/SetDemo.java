package collections;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("salitha");
        set1.add("mike");
        set1.add("salitha");   // no duplicates in the final set

        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println(set1.contains("salitha"));
        set1.remove("salitha");
        set1.clear();

        // loop over a set
        for (String s: set1) {
            System.out.println(s);
        }
        // OR
        Iterator<String> iterator = set1.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        TreeSet<String> set3 = new TreeSet<>();
        set3.add("John");
        set3.add("Jane");
        set3.add("Jim");
        set3.add("Jack");
        System.out.println(set3);       // sorted in ascending order

    }

}
