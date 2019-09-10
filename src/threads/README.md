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
```java
main            // from main thread
newer thread      // from new thread
```