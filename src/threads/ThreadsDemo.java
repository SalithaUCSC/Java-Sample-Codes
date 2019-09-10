package threads;

public class ThreadsDemo {
    public static void main(String[] args) {
        System.out.println("main");
        new Thread(()-> {
            System.out.println("new thread");
        }).start();
    }

}
