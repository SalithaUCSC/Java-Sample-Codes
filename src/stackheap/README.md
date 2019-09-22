#Java Stack and Heap Memory

>Stack Memory

Java Stack memory is used for execution of a thread. 
They contain method specific values that are short-lived(local variables) 
and references to other objects in the heap that are getting referred from the method.

>Heap Space

Java Heap space is used by java runtime to allocate memory to Objects and JRE classes. 
Whenever we create any object, it’s always created in the Heap space.

![test](https://user-images.githubusercontent.com/23145752/65375849-49fdb380-dcb7-11e9-99a8-eb4de0bb9f16.png)
------
In the above code, first main method thread is found, JRE creates a 
stack to execute the **main()**. The main method finds **method1()** first. 
Then it's called. **x** is created and stored as a local primitive variable within the allocated 
frame for method1(). Then method() is calling for method2(). As the next 
step, **method2()** is executed. A new frame is created for method2(). 
It takes an Integer **a** - as a parameter. Then **b** is also put in this frame. Now method2() 
calls **method3()**. This method3() is creating a **Student** object. So now this object 
is created in **Heap**. The reference variable for that object is stored in 
**Stack** as **st**.
<br>
When main() method execution is over stack is ready to be free. So then 
**method3()** is popped out first. All local variables are destroyed whenever a 
method is flushed out. Reference variable **st** is no more. In this situation,
> **Garbage Collector** comes into the play!

Now **Student** is eligible to be destroyed. 
So **GC** removes the object from Heap.
Once method2() has completed its execution,
it will be popped out of the stack, and all its variables will be 
flushed and no longer be available for use.

Likewise for method1().

> Whenever an object in Heap is destroyed, **finalize()** method is called.