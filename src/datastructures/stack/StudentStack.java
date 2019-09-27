package datastructures.stack;

public class StudentStack {

    private Student[] stack;
    private int top;
    private  int size;

    public StudentStack(){
        top = -1;
        size = 50;
        stack = new Student[50];
    }

    StudentStack(int size){
        top = -1;
        this.size = size;
        stack = new Student[this.size];
    }

    public boolean push(Student item){
        if(!isFull()){
            top++;
            stack[top] = item;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull(){
        return (top == stack.length - 1);
    }

    public Student pop(){
        return stack[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

}
