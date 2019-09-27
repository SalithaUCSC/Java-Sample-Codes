package datastructures.stack;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name: "+this.name+" | Age: "+this.age;
    }
}
