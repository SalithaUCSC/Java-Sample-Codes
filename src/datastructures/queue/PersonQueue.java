package datastructures.queue;

public class PersonQueue {
    private Person[] queue;
    private int size;
    private int total;
    private int front;
    private int rear;

    public PersonQueue(){
        size = 100;
        total = 0;
        front = 0;
        rear = 0;
        queue = new Person[size];
    }

    public PersonQueue(int size){
        this.size = size;
        total = 0;
        front = 0;
        rear = 0;
        queue = new Person[this.size];
    }

    public boolean isFull(){
        if(size == total){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        return (total == 0);
    }

    public boolean enqueue(Person item){
        if(!isFull()){
            total++;
            queue[rear] = item;
            rear++;
            return true;
        }
        else {
            System.out.println("Stack is Full!");
            return false;
        }
    }

    public Person dequeue(){
        Person item = queue[front];
        total--;
        front++;
        return item;
    }
}
