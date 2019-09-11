package generics;

import java.util.ArrayList;
import java.util.List;

class Container<T> {
    T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void display() {
        System.out.println(getValue().getClass().getName());
    }
}

class ContainerWithType<T extends Number> {
    T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void display() {
        System.out.println(getValue().getClass().getName());
    }
}

class StudentGeneric<Student> {
    Student value;

    public void display() {
        System.out.println(value.getClass().getName());
    }
}

class Student{
   private String name;
   private int age;

   Student(){
       System.out.println("I'm a student");
   }
}

class ContainerArray<T extends Number> {
    public void getArray(ArrayList<? extends T> arr) {
        System.out.println(arr);
    }
}

public class GenericsDemo {

    public static void main(String[] args) {

        // without Generics
//        List list = new ArrayList();
//        list.add("ddd");
//        list.add(3);
//        System.out.println(list.get(1));

        // with generics - give the generic TYPE within <>
        Container<Integer> container1 = new Container<>();
        container1.setValue(10);
        container1.display();

        Container<String> container2 = new Container<>();
        container2.setValue("10");
        container2.display();

        StudentGeneric<Student> container3 = new StudentGeneric<>();
        Student student = new Student();
        container3.value = student;
        container3.display();

        ContainerWithType<Integer> container4 = new ContainerWithType<>();
        container4.setValue(10);
        container4.display();

        ContainerArray<Number> container5 = new ContainerArray();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        container5.getArray(array);

    }
}


