# Threads in Java

### MultiTasking
>perform multiple jobs concurrently

### MultiThreading
 >control multiple threads within a program

### Thread
 >single sequence of execution within a program

If we run heavy computation tasks within the main Java thread, sometimes program gets
stuck. As an example consider a GUI program that calculate the sum of the numbers
upto a given number using a for loop. If we give a very large number to the GUI to calculate
the sum upto it, program will run.. But the GUI will be **not responding**! Because the
computation and GUI are running on the **same thread**. To avoid this, we can use **THREADS**
in Java. We can hand over the heavy task to another thread and keep the main thread to
run GUI. Then GUI will not become not responding!!!
 
Usually Java programs run in a single thread called Main. That is the default thread.
```java
public static void main(String[] args) {
    Thread t = Thread.currentThread();
    System.out.println(t.getName());
}
```
```java
main    // output
```
We can set a name to the thread. Then it will display the new thread name.
```java
t.setName("Main Thread");
```
```java
Main Thread    // output
```
Checkout the below code! We can tun multiple tasks within multiple threads. 
This code prints two lines from two threads.
```java
public static void main(String[] args) {
     System.out.println("main");
     new Thread(()-> {
         System.out.println("newer thread");
     }).start();
 }
```
**OR**
```java
public static void main(String[] args) {
    System.out.println("main");
    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("newer thread");
        }
    });
    t.start();
}
```
```java
main            // from main thread
newer thread      // from new thread
```

### Implementation of Threads
>1. Extending from Thread class
>2. Implementing Runnable Interface

### 1. Extending from Thread class
In this way, we have to inherit the Thread class to out custom class. Then override
the **run()** method which is a super class method.
```java
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
```

### 2. Implementing Runnable Interface
Here we have to implement the class from Runnable Interface. Then we must override the method
**run()** since Runnable is an interface.
```java
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
```
> **sleep()** method keeps the thread awake until the time is gone that we define
>as a parameter. After that time, program is terminated.

>**join()** method allows one thread to wait until another thread completes its execution.

---
### Synchronized key word

**Synchronization** in java is the capability to control the access of multiple threads to any shared resource.
<br> So after synchronization, one thread will run at a time!<br>
**Synchronized** method is used to **lock an object** for any shared resource. 
When a thread invokes a synchronized method, it automatically acquires the 
lock for that object and releases it when the thread completes its task. <br>
Look at the below code...

```java
class Resource {

    private String name;
    public synchronized void getAccess(String resource)
    {
        System.out.println(resource+" is accessed by "+Thread.currentThread().getName());
        try
        {
            Thread.sleep(1000);
        }
        catch (Exception e)
        {
            System.out.println("Thread Exception Found!");
        }
        System.out.println(resource+" is released by "+Thread.currentThread().getName());
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ThreadRun extends Thread {

    Resource resource;

    ThreadRun(Resource obj)
    {
        resource = obj;
    }

    @Override
    public void run()
    {
        resource.setName("R");
        resource.getAccess(resource.getName());
    }
}

public class SynchronizedDemo {
    public static void main(String args[])
    {
        final Resource obj = new Resource();
        ThreadRun t1 = new ThreadRun(obj);
        ThreadRun t2 = new ThreadRun(obj);
        t1.start();
        t2.start();
    }
}
```
```java
// output
R is accessed by Thread-0
R is released by Thread-0
R is accessed by Thread-1
R is released by Thread-1
```
The one and only resource R is accessed by a Thread, after it's released only! If we reomve the 
synchronized word from the method getAccess(), you can see the resource R is
accessed by the 2 threads concurrently. <br>

>**Synchronized block** can be used to perform synchronization on any specific resource of the method.

>If any **static** method is made as synchronized, the lock will be on the class not on object.

