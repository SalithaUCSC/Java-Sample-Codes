# Java Wrapper Classes

There are 8 primitive data types in Java. Wrapper classes are used to convert these primitives
into **objects**. The below table shows you the primitives and their wrappers. Using 
wrapper classes, we can wrap a primitive value into a wrapper class object.<br>

| Primitive  | Wrapper |
| :---------- | :----------|
| boolean  | Boolean  |
| byte  | Byte |
| char | Character |
| short  | Short |
| int| Integer |
| long  | Long |
| float  | Float |
| double  | Double |
<br>

> Usage of Wrappers

* Objects are needed if we wish to modify the arguments passed into a method 
(because primitive types are passed by value).
* Data structures in the Collection framework, such as ArrayList and Vector, store only 
objects (reference types) and not primitive types.
* An object is needed to support synchronization in multithreading.

### AutoBoxing

Automatic conversion of primitive types into objects according to their corresponding 
wrapper classes is known as autoboxing. <br>
E.g.    int to Integer , byte to Byte

```java
int x = 20;  
Integer y = x;  // Integer.valueOf(x) is called implicitly
```
        
### Unboxing

Automatic conversion of wrapper class objects into their corresponding primitive values 
is known as autoboxing. <br>
E.g.    Integer to int , Byte to byte
```java
Integer x = new Integer(30);    
int y = x;  // Integer.intValue(x) is called implicitly
``` 



