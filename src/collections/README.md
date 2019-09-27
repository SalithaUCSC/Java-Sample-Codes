# Collections Framework

* Collections are containers that groups multiple items
in a single unit.
* Provides an architecture to store and manipulate a 
group of objects.
* Contains a set of classes and interfaces.
* Can be used to perform search, sort, insertion, deletion and etc.. on data.
<br>

### Collection Hierarchy
![image](https://user-images.githubusercontent.com/23145752/64665696-1c239e00-d471-11e9-8099-6ffb312d5066.png)
-----

### 1. List
Contains ordered collection of elements including duplicates.
>Declaration
```java
 ArrayList<String> arrayList = new ArrayList();
```
>some common operations
```java
System.out.println(arrayList)   // display list
arrayList.add("salitha")        // add element to the list
arrayList.size()                // return the size
arrayList.get(0)                // get element by index
arrayList.subList(0,2))         // make a sub list by giving lower and upper indexes
arrayList.contains("salitha")   // check whether an element is in the list or not
arrayList.set(1, "andrew")      // update element by index
arrayList.remove(1)             // remove element by index
arrayList.clear()               // remove all the elements in the list
```

### 2. Queue
Follows a FIFO(First In First Out) approach.
> Declaration
```java
Queue<Integer> queue = new LinkedList<>();  // OR
PriorityQueue<Integer> queue = new PriorityQueue<Integer>();  
```
>some common operations
```java
System.out.println(queue);      // display queue
queue.add(1)                    // add elements to the queue
queue2.peek()                   // returns the head of queue
queue.poll()                    // remove the head of queue
```
### 3. Set
Contains ordered collection of elements **without** duplicates. <br>
Set has its implementation in various classes. <br>
* HashSet, LinkedHashSet, TreeSet

>HashSet

* Contains unique elements.
* Uses a **hash** function to store elements. It generates a hashCode for each element.
* Elements are unordered due to hashing.
```java
Set<String> set = new HashSet<>();
```
>LinkedHashSet
* Contains unique elements.
* Hash Table and Linked list implementation of Set interface.
* Maintains the insertion order. Elements gets sorted in the same sequence in which they have been added to the Set.
```java
LinkedHashSet<String> set = new LinkedHashSet<>();
```
>TreeSet
* Contains unique elements.
* Sorts the elements in ascending order.
```java
TreeSet<String> set = new TreeSet<>();
```
>some common operations for all type of sets
```java
System.out.println(set);    // display set
set.add("salitha")          // add elements to the set
set.size()                  // return the size
set.contains("salitha")     // check whether an element is in the set or not
set.remove("salitha")       // remove an element from set
set.clear()                 // remove all the elements in the set
```