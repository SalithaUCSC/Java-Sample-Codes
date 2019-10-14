# Comparable and Comparator in Java

* Both of these interfaces are used for **comparing custom class 
objects**.
* If we want to use sorting methods in **Arrays** or **Collections** 
classes, these are very important.
* Any attribute of the object can be used as the sorting field.
* With Comparable, **compareTo** method should be implemented.
* With Comparator, **comparison** method should be implemented.

This is the custom class that is used here.

```java
public class Person {

    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString(){
       String person =
            "{"+
                "Name="+name+" , "+
                "Age="+age+" , "+
                "Job="+job+
            "}"
       ;
       return person;
    }
}
```
<br>

### Comparable

* Comparable is an interface defining a strategy of **comparing an object 
with other objects of the same type**. 
  <br>E.g. A List of person objects
>Implementation
* The custom class(Person) must be implemented by **Comparable**.
* **compareTo** method must be overridden. It takes one argument of the class
that is used.
* **toString** method must be overridden in a meaningful
way. Otherwise, when we print the list, reference addresses will be 
displayed.
>Code
```java
public class Person implements Comparable<Person>{
    
    // consructor, getters and setters...

    @Override
    public int compareTo(Person p) {
        return this.getName().compareTo(p.getName());
    }

    @Override
    public String toString(){}

}
```
Here, the persons are compared according to the **names of persons**.
So, String comparison method is used.<br>

This is the way how we can comparison using **ages of persons**. Since values are
integers, we can just reduce the two values.
```java
    @Override
    public int compareTo(Person p) {
        return this.getAge() - p.getAge();
    }
```
>Usage
```java
public class CompareDemo {

    public static void main(String[] args) {

        Person p1 = new Person("salitha", 25, "SE");
        Person p2 = new Person("kamal", 24, "QDA");
        Person p3 = new Person("nimal", 20, "BA");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        System.out.println("before sorting: "+list);
        Collections.sort(list);
        System.out.println("after sorting: "+list);
    }
}
```
```
before sorting: [{Name=salitha , Age=25 , Job=SE}, {Name=kamal , Age=24 , Job=QA}, {Name=nimal , Age=20 , Job=BA}]
after sorting: [{Name=kamal , Age=24 , Job=QA}, {Name=nimal , Age=20 , Job=BA}, {Name=salitha , Age=25 , Job=SE}]
```
<br>

### Comparator

* Comparator is an interface defining a strategy of **comparing two objects of the same type**. 
>Implementation
* The custom **Comparator** class must be created.
* It must be implemented by **Comparator**.
* **compare** method must be overridden. It takes two arguments of the class
that is used.
>Code for a **name** comparator
```java
public class PersonNameChecker implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
```

>Code for an **age** comparator
```java
public class PersonAgeChecker implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - p2.getAge();
    }
}
```
>Usage
```java
public class CompareDemo {

    public static void main(String[] args) {

        Person p1 = new Person("salitha", 25, "SE");
        Person p2 = new Person("kamal", 24, "QA");
        Person p3 = new Person("nimal", 20, "BA");
        Person[] persons = new Person[3];
        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;

        // SORT BY AGE
        PersonAgeChecker personAgeChecker = new PersonAgeChecker();
        Arrays.sort(persons, personAgeChecker);
        for(int i = 0; i < persons.length; i++){
            System.out.printf("%s %s\n", persons[i].getName(), persons[i].getAge());
        }

        // SORT BY NAME
        PersonNameChecker personNameChecker = new PersonNameChecker();
        Arrays.sort(persons, personNameChecker);
        for(int i = 0; i < persons.length; i++){
            System.out.printf("%s %s\n", persons[i].getName(), persons[i].getAge());
        }
    }
}
```

```
SORT BY AGE:
nimal 20
kamal 24
salitha 25

SORT BY NAME:
kamal 24
nimal 20
salitha 25
```
