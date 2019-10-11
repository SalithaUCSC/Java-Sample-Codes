# Exception Handling

Exception is an abnormal behavior disrupting the normal flow of any program. 
These exceptions are occurred Run Time according to the user reactions and 
inputs to a program.. These can be managed through validations or otherwise 
have to create exceptions with a message pass to identify abnormal behaviors.
<br><br>
![exp2](https://user-images.githubusercontent.com/23145752/66625933-f9bda580-ec13-11e9-9169-8d25d0ce06ce.png)
<br><br>

>Why to handle Exceptions?

1. To avoid terminating the program
2. To inform user when there's an abnormal behavior in the program
<br><br>
>Hierarchy of Exceptions

![exp1](https://user-images.githubusercontent.com/23145752/66626010-3db0aa80-ec14-11e9-8010-5c0674f4db8c.png)
<br>
<br>
**Checked Exceptions :** <br>
These are called Compile Time Exceptions and occurred compile time and have 
to take measures to handle without ignoring.
<br>Ex: IOException, FileNotFoundException

**Unchecked Exceptions :** <br>
These ones are occurred when program is executing, called as Run Time 
Exceptions. They are ignored when a program is compiled.
<br>Ex: ArrayOutOfBounException, ArithmeticException

### Steps to handle an exception:
1. Include a try catch block.
2. Place the code lines that can give errors within the try block.
3. Then start the catch block. Pass an object reference to refer the newly 
created exception object.

>Basic Example:

```java
public static void main(String args[]){
    System.out.println("Start Program");
    int x = 10, d = 0;
    try{
        int y = 50/d;
    }catch(ArithmeticException ex){
        System.out.println("This is the catch block");
        ex.printStackTrace();
    }
    System.out.println("End Program");
}
```

Here, 50 is divided by zero. It's infinity! So, the exception throws as an
**Arithmetic Exception**.<br>
Since I handled it, the logic within the **catch** block is executed.

### There are few cases in exceptions
* Catch block runs when there's an exception only.
```java
public static void main(String args[]){
    System.out.println("Start Program");
    int x=10,d=2;
    try {
        x=50/d;  // Since d=2 there are no errors. If d = 0 ?
    } catch(ArithmeticException ob){
        System.out.println("This is the catch block");
    }
    System.out.println("End Program");
}
```
```
Start Program
End Program
```

* After the exception object is created, the remaining coding in the try 
block will not execute.

```java
public static void main(String args[]){
    System.out.println("Start Program");
    int x=10,d=0;
    try {
        x=50/d; 
        System.out.println("This is not printed!");
    } catch(ArithmeticException ob){
        System.out.println("This is the catch block");
    }
    System.out.println("End Program");
}
```

```
Start Program
This is the catch block
java.lang.ArithmeticException: / by zero
	at exceptions.ExceptionsDemo.main(ExceptionsDemo.java:9)
End Program 
```

* If we have created the Exception Object using an **incompatible Exception 
Class**, there's a problem. Exception handling process is not working. 
Then JVM hands over the process to the DEH(Default Exception Handler). 
DEH will terminate the program most of the times.

* Object class(most super class of all classes) can not be used as an 
exception class. The Object class **does not have** throwable qualities.

* **Catch Ladder** <br>
  Multiple catch blocks can be created for a single try block. 
  After reaching a catch block if its object reference is **incompatible**, 
  then moves into the next catch block. Catch ladder must be continuous 
  and not breakable. If catch ladder is using the Exception classes within 
  the same class hierarchy, the most super class should be included in the 
  last catch block as the **Base Exception** class.
  
```java
public static void main(String args[]){
    try{
        int x[]=new int[5];
        x[5]=30/0;      // line 1 - influence ArithmeticException
        x[6]=30/6;      // line 2 - influence ArrayIndexOutOfBoundsException
    }
    catch(ArithmeticException e){
        System.out.println("catch block 1");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("catch block 2");
    }
    catch(Exception e){
        System.out.println("catch block 3");
    }
    System.out.println("out of try catch");
}
```
``` 
catch block 1
```
  
* If catch block handles multiple exceptions, they can be managed with one catch
block using **PIPE (|)** operator.
```java
catch(IOException | SQLException ex){
     logger.error(ex);
     throw new MyException(ex.getMessage());
}
```
<br>

**Throw keyword** <br><br>
In java, this throw keyword is used to throw a **new exception by force**. 
That exception can be checked or unchecked.
<br>
```java
static void validate(int salary){
    if(salary<30000)
        throw new ArithmeticException("not valid");
    else
        System.out.println("You can apply the loan");
}
    
public static void main(String args[]){
    validate(3000);
    System.out.println("After validation");
}
```

``` 
Exception in thread "main" java.lang.ArithmeticException: not valid
```
<br>

**Throws keyword**<br><br>
Think that a methods have a possibility to occur an exception. 
You want to tell this when you declare the function. This is the way to do 
it! We can declare s java method adding **throws** keyword. But whenever you 
add this code, that method **cannot be called directly anywhere**. 
That method **must be enclosed to a try catch block** or **throw the relevant 
exception at its method declaration**.

```java
static void testNumber(int i) throws FileNotFoundException, IOException {
    if(i < 0){
        throw new FileNotFoundException("Negative Integer "+i);
    }else if(i > 10){
        throw new IOException("Only supported for index 0 to 10");
    }

}
```
When we try to call the method without a try catch blcok, compiler will 
warn us!

![thows](https://user-images.githubusercontent.com/23145752/66627744-41dfc680-ec1a-11e9-8ed2-ffea872e7d97.png)

```java
public static void main(String args[]){
    try{
        testNumber(-5);
        testNumber(-10);
    }catch(FileNotFoundException e){
        e.printStackTrace();
    }catch(IOException e){
        e.printStackTrace();
    }catch(Exception e){
        e.printStackTrace();
    }
}
```
``` 
java.io.FileNotFoundException: Negative Integer -5
```
<br>

**Finally keyword**<br>

* Finally keyword is used when we want omething to be executed **whether the 
code is having exceptions or not**.
* **A try block can have many catch blocks, 
but only one finally block!** 
Finally block is opened and place that finalizing code into it. <br>
E.g. <br>
**Handling files with Java** - file should be closed whether there is an
exception or not.
```java
int x = 10, d = 0;
try{
    int y = 50/d;

} catch(ArithmeticException ex){
    System.out.println("This is the catch block");
    ex.printStackTrace();

} finally {
    System.out.println("Finally block is executed!");
}
```
``` 
This is the catch block
java.lang.ArithmeticException: / by zero
	at exceptions.ExceptionsDemo.main(ExceptionsDemo.java:30)
Finally block is executed!
```
<br>

### Custom Exceptions

1. Create a class for Exceptions and extend it from **Exception** class.
2. Define a mechanism to detect each kind of exception with a 
defined error message and code.
>Code for Custom Exception Class
```java
public class MyException extends Exception {

    private String errorLine = "Unknown Exception";
    private int errorCode = 404;

    public MyException(String message, String errorLine){
        super(message);
        this.errorLine = errorLine;
    }

    public String getErrorLine(){
        return this.errorLine;
    }

    public int getErrorCode(){
        return this.errorCode;
    }

}
```

>Code for defining error messages handling exceptions

```java
static void processErrorMsgs(MyException e) throws MyException {
    switch(e.getErrorLine()){
        case "FILE_NOT_FOUND_EXCEPTION":
            System.out.println("FILE NOT FOUND");
            throw e;
        case "FILE_CLOSE_EXCEPTION":
            System.out.println("CAN NOT CLOSE FILE");
            break;
        default:
            System.out.println("UNKNOWN EXCEPTION "+e.getMessage());
            e.printStackTrace();
    }
}
```

```java
public static void main(String[] args) throws MyException {

    try {
        processFile("test.tx");     // correct file -> test.txt
    } catch (MyException e) {
        processErrorMsgs(e);
    }

}
```
``` 
FILE NOT FOUND
Exception in thread "main" exceptions.MyException: test.tx (No such file or directory)
	at exceptions.TestMyException.processFile(TestMyException.java:32)
	at exceptions.TestMyException.main(TestMyException.java:47)
```



