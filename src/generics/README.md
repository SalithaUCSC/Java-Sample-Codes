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
