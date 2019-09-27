package datastructures.stack;

public class IntStack {

    private int[] stack;
    private int top;
    private  int size;

    public IntStack(){
        top = -1;
        size = 50;
        stack = new int [size];
    }

    IntStack(int size){
        top = -1;
        this.size = size;
        stack = new int [this.size];
    }

    public boolean isFull(){
        return (top == stack.length - 1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean push(int item){
        if(!isFull()){
            top++;
            stack[top] = item;
            return true;
        }
        else {
            System.out.println("Stack is Full!");
            return false;
        }
    }

    public int pop(){
        return stack[top--];
    }

}
