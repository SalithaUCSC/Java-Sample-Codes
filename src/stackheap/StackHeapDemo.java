package stackheap;

class Memory {
    public void method1(){
        int x = 10;
        System.out.println("method 1");
        method2(x);
    }

    public void method2(int a){
        System.out.println("method 1");
        System.out.println("parameter: "+a);
        method3();
    }

    public void method3(){
        System.out.println("method 3");
    }
}
public class StackHeapDemo {

    public static void main(String[] args) {
        Memory memory = new Memory();   // created in Heap  // Reference is in Stack
        memory.method1();               // put in the stack
    }
}
