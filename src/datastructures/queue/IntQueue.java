package datastructures.queue;

import datastructures.stack.Student;

public class IntQueue {

    private int[] queue;
    private int size;
    private int total;
    private int front;
    private int rear;

    public IntQueue(){
        size = 100;
        total = 0;
        front = 0;
        rear = 0;
        queue = new int[size];
    }

    public IntQueue(int size){
        this.size = size;
        total = 0;
        front = 0;
        rear = 0;
        queue = new int[this.size];
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

    public boolean enqueue(int item){
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

    public int dequeue(){
        int item = queue[front];
        total--;
        front++;
        return item;
    }
}
