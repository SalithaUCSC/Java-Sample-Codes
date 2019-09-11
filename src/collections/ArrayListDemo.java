package collections;

import java.util.ArrayList;

class Student {
    private String name;
    private int age;

    Student(String n, int a){
        this.name = n;
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("salitha");
        arrayList.add("john");
        arrayList.add("mike");
        arrayList.add("adam");
        arrayList.add("steve");

        // display the whole list
        System.out.println(arrayList);

        // loop over elements
        for (String s: arrayList) {
            System.out.println(s);
        }
        System.out.println("================================");
        // OR
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("================================");

        // more operations on ArrayLists
        System.out.println(arrayList.size());
        System.out.println("First Element: "+arrayList.get(0));
        System.out.println(arrayList.subList(0,2));
        System.out.println(arrayList.contains("salitha"));
        arrayList.set(1, "andrew");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);

        // Define ArrayLists with a type rather than primitive types
        ArrayList<Student> customList = new ArrayList();
        Student st1 = new Student("michael", 25);
        customList.add(st1);
        Student st2 = new Student("nelson", 29);
        customList.add(st2);
        System.out.println(customList);

        // loop over student objects
        for (Student st: customList) {
            System.out.println(st.getName() + " | " + st.getAge());
        }
    }

}
