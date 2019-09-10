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

        StudentGeneric<Student> container = new StudentGeneric<Student>();
        Student student = new Student();
        container.value = student;
        container.display();

        ContainerWithType<Integer> container3 = new ContainerWithType<>();
        container3.setValue(10);
        container3.display();

        ContainerArray<Number> container4 = new ContainerArray();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        container4.getArray(array);

    }
}


