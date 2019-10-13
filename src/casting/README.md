# Casting in Java

* Casting is the process of making a variable behaves as a variable of another type. 
* If there's inheritance between two classes, their variables can be cast to each 
other’s type.
* Any variable **can not be casted** to any another type of variable.
* There are only allowed casting types depending on the variable data type.

### Casting primitive variables

```java
byte x = 10;        // SIZE - 1 bytes
short y = 20;       // SIZE - 2 bytes
int z = 30;         // SIZE - 4 bytes
double d = 40;      // SIZE - 8 bytes

int i = y;              // Assign 2 bytes y to 4 bytes int
short s = x;            // Assign 1 byte x to 2 bytes short
double t = i;           // Assign 4 bytes i to 8 bytes double

byte b = (byte) y;      // Assign 2 bytes y to 1 byte
short a = (short) z;    // Assign 4 bytes z to 2 bytes short
int j = (int) d;        // Assign 8 bytes z to 4 bytes int

```

### Casting objects

> Up Casting
>
Converting a subclass type to a superclass type, upward to the inheritance tree.

```java
// SYNTAX 
// Sub sub = new Sub();
// Super obj = (Super) sub;

Dog dog = new Dog();
Animal animal = (Animal) dog;   // upcasting
animal.eat();
```
Here, we cast the **Dog** type to the **Animal** type. Because Animal is the supertype of Dog, 
this casting is called upcasting.

> Down Casting

Converting a superclass type to a subclass type, downward to the inheritance tree.

```java
// SYNTAX 
// Super obj = new Sub();
// Sub sub = (Sub) obj;
     
Dog dog = (Dog) animal;         // downcasting
```
Here, we cast the **Animal** type to the **Cat** type. 
As Cat is subclass of Animal, this casting is called downcasting.


**ClassCastException**
```java
Animal animal = new Cat();
```
```
Exception in thread "main" java.lang.ClassCastException: casting.Cat cannot be cast to casting.Dog at casting.CastingDemo.main(CastingDemo.java:44)
```

* Casting does not change the actual object type. Only the reference type gets changed.
*  Upcasting is always safe and never fails.
*  Downcasting can risk throwing a **ClassCastException**, so the instanceof operator is used to 
check type before casting.
