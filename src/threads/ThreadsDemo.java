package threads;

class ThreadTest extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" value => "+i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" value => "+i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadsDemo {
    public static void main(String[] args) {

        System.out.println("main");

        new Thread(()-> {
            System.out.println("new thread");
        }).start();

        // using anonymous class
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread in Main");
            }
        });
        t.start();

        // Extending Thread Class
//        ThreadTest t1 = new ThreadTest();
//        t1.start();
//        ThreadTest t2 = new ThreadTest();
//        t2.start();

        // Implementing Runnable Interface
//        Thread t3 = new Thread(new ThreadRunnable());
//        t3.start();
//        Thread t4 = new Thread(new ThreadRunnable());
//        t4.start();
    }

}
