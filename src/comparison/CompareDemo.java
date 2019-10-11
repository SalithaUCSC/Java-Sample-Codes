package comparison;

import java.util.*;

public class CompareDemo {

    public static void main(String[] args) {

        Person p1 = new Person("salitha", 25, "SE");
        Person p2 = new Person("kamal", 24, "QA");
        Person p3 = new Person("nimal", 20, "BA");

        // USAGE OF COMPARABLE
        System.out.println("USAGE OF COMPARABLE\n==============================");
        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println("before sorting: "+list);
        Collections.sort(list);
        System.out.println("after sorting: "+list);

        System.out.println();

        // USAGE OF COMPARATOR
        System.out.println("USAGE OF COMPARATOR\n===================");
        Person[] persons = new Person[3];
        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;

        System.out.println("SORT BY AGE:");
        PersonAgeChecker personAgeChecker = new PersonAgeChecker();
        Arrays.sort(persons, personAgeChecker);
        for(int i = 0; i < persons.length; i++){
            System.out.printf("%s %s\n", persons[i].getName(), persons[i].getAge());
        }
        System.out.println();
        System.out.println("SORT BY NAME:");
        PersonNameChecker personNameChecker = new PersonNameChecker();
        Arrays.sort(persons, personNameChecker);
        for(int i = 0; i < persons.length; i++){
            System.out.printf("%s %s\n", persons[i].getName(), persons[i].getAge());
        }

    }
}
