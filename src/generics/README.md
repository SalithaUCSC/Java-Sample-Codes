# Generics

Generics are used to achieve Type Safety in Java variables. <br>

Defined within <> symbols. <br>

If we declare a List(from Collections API) without a Type, it will be like this. <br>
```java
List list = new ArrayList();
```
Then we add two elements which are a string and a integer. <br>
```java
list.add("salitha");
list.add(25);
```
Here we are adding two types of data to the list. This violate the type safety! So we have to achieve Type safety in a way like this. <br>
```java
List<Integer> list = new ArrayList<Integer>();
```
Now we can only add Integer values to the list. Type safety is there! <br>

### Build a custom Generic
We can create a class with any Element Type called as T. <br>
Then we can assign any Data Type when we use that class. Look at the below example. <br>

```java
class Container<T> {
    T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void display() {
        System.out.println(getValue().getClass().getName());
    }
}
```
In display() method we are trying to get the class name of the value variable. 
We have to define it when we create the instance from this class.
```java
Container<Integer> container = new Container<>();
container.setValue(10);
container.display(); // output 1

Container<String> container = new Container<>();
container.setValue("10");
container.display(); // output 2
```
Since we call the method, It should display the type of value variable!

```java
java.lang.Integer   // output 1
java.lang.String    // output 2
```
Generics TYPES only support for Wrapper classes like Integer, Double, String and etc. We can not 
include int, double as Generic TYPES. But we can set a custom class as a Generic like this.
```java
class StudentGeneric<Student> {
    Student value;

    public void display() {
        System.out.println(value.getClass().getName());
    }
}

StudentGeneric<Student> container = new StudentGeneric<Student>();
Student student = new Student();
container.value = student;
container.display();
```

# Restrict custom Generics to a specific Data Type

If we want to restrict our generics to one Data Type, we have to 
extend the generic type T from a super class off the Data Type we consider!
```java
class ContainerWithType<T extends Number> {
    T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void display() {
        System.out.println(getValue().getClass().getName());
    }
}

ContainerWithType<Integer> container = new ContainerWithType<>();
container.setValue(10);
container.display();
```
Now you can only set the generics which are sub classes of Number class! <br>
Such as Integer, Double, Float... <br>
If we set a different type, it shows an error compile time! <br>

Look at the below example..

```java
class ContainerArray<T extends Number> {
    public void getArray(ArrayList<? extends T> arr) {
        System.out.println(arr);
    }
}

ContainerArray<Number> container4 = new ContainerArray();
ArrayList<Integer> array = new ArrayList<>();
array.add(1);
array.add(2);
array.add(3);
container4.getArray(array);
```
Here the ContainerArray instance has been created with Type Number(Super class). <br>
In getArray() method we see a different syntax. <br>
```java 
ArrayList<? extends T> arr // parameter
```
When we create ContainerArray with Number, T => Number <br>
When we pass Integer array to getArray(), ? => Integer extends T => Number <br>
Inheritance is there! We can use any sub class of Number class here such sa Double and Float.