package datastructures;

import datastructures.queue.IntQueue;
import datastructures.queue.Person;
import datastructures.queue.PersonQueue;
import datastructures.stack.IntStack;
import datastructures.stack.Student;
import datastructures.stack.StudentStack;

public class Test {

    public static void main(String[] args) {
//        IntStack intStack = new IntStack();
//        intStack.push(2);
//        intStack.push(4);
//        intStack.push(6);
//        intStack.push(8);
//        System.out.println(intStack.pop());
//        System.out.println(intStack.pop());
//        System.out.println(intStack.pop());
//        System.out.println(intStack.pop());
//        System.out.println(intStack.isEmpty());
//
//        Student st1 = new Student("salitha", 25);
//        Student st2 = new Student("dulitha", 25);
//        Student st3 = new Student("lasitha", 25);
//        StudentStack studentStack = new StudentStack();
//        studentStack.push(st1);
//        studentStack.push(st2);
//        studentStack.push(st3);
//        System.out.println(studentStack.pop().toString());
//
//        IntQueue intQueue = new IntQueue();
//        intQueue.enqueue(2);
//        intQueue.enqueue(4);
//        intQueue.enqueue(6);
//        intQueue.enqueue(8);
//        System.out.println(intQueue.isEmpty());
//        System.out.println(intQueue.dequeue());
//        System.out.println(intQueue.dequeue());
//        System.out.println(intQueue.dequeue());
//        System.out.println(intQueue.dequeue());
//        System.out.println(intQueue.isEmpty());

        PersonQueue personQueue = new PersonQueue();
        Person p1 = new Person("salitha", 25);
        Person p2 = new Person("dulitha", 25);
        Person p3 = new Person("lasitha", 25);
        System.out.println(personQueue.isEmpty());
        personQueue.enqueue(p1);
        personQueue.enqueue(p2);
        personQueue.enqueue(p3);
        System.out.println(personQueue.isEmpty());
        System.out.println(personQueue.dequeue());
        System.out.println(personQueue.dequeue());
        System.out.println(personQueue.dequeue());
        System.out.println(personQueue.isEmpty());
    }
}
