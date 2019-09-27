# Java String Classes

**String** in Java is a **unique char sequence**.
Java provides 3 String classes.
* String        -> Immutable
* StringBuilder -> Mutable
* StringBuffer  -> Mutable

> Immutable

**String** class is immutable. That means strings **can not be 
modified** once it is initialized.

> Mutable

**StringBuilder** and **StringBuffer** classes are mutable. 
That means strings **can be modified** once it is initialized.

## 1. String Class

Two ways to declare :
* String Literals
```java
String str = "Salitha";
```

* Using new keyword
```java
String str = new String("Salitha");
```

### What is the difference?

When we create without **new** kyword, it is created in a place called 
**String Pool** which is located in Java **Heap** Space. These are called
String **Literals**. <br><br>
When we consider the word
"Salitha", it is always **same** if we assign it into 1000 variables.
The below image is showing this scenario. Strings referenced as 
**str1** and **str2** are assigned to "Salitha". Since the value is same, both
reference variables are pointing to the same char sequence.
```java
String str1 = "Salitha";  // 2 strings are equal
String str2 = "Salitha";
```

When we use **new** keyword, those strings are stored in directly Heap space.
If we assign the **same char set** to two variables in Heap and Pool, then they 
will be **not equal**.
```java
String str2 = "Salitha";             // 2 strings are not equal
String str3 = new String("Salitha");
```
![strpool](https://user-images.githubusercontent.com/23145752/65381328-8a3b5100-dd0c-11e9-84cb-80c68e0da36c.png)

### If Strings are IMMUTABLE, what do methods in String class are doing?
There is a list of methods that can handle strings in String class. Among them, 
most common one is **concat()** which helps to join strings. If strings 
immutable, how can we use these methods?
<br><br>
Actually what these methods do is, **only take a copy of the original
string and perform the operations on it**. Always the original is kept safe.
```java
String s1 = "Hello ";
String s2 = "World";
String s3 = s1.concat(s2);
System.out.println(s3);
System.out.println("s1: "+s1+" "+"s2: "+s2);    // s1 s2 not changed
s1 = s1.concat(s2);
System.out.println("s1: "+s1+" "+"s2: "+s2);    // s2 changed due to assignment
```

### Check equality of two strings
```java
String str1 = "Salitha"; 
String str2 = "Salitha";   
String str3 = new String("Salitha");
String str4 = new String("Salitha");
System.out.println(str1 == str2);  // true - both are in the pool
System.out.println(str1 == str3);  // false - str1 is in pool & str3 in in heap
System.out.println(str3 == str4);  // false - two references for two heap objects
```
Here, **str1 and str2 are pointing to the same char sequence**. Therefore, they
are considered as equal. But when it comes to str1 and str3, one is 
in the String Pool and the other is in teh Heap. So, they are not equal.

> ### equals() method

This method go inside the string and consider the **content of the 
string**. If it finds that there is the same char sequence
in the content, without looking at the place where it's located, 
it returns true!
```java
System.out.println(str1.equals(str2));      // true
System.out.println(str1.equals(str3));      // true
System.out.println(str1.equals(str3));      // true
System.out.println(str2.equals(str3));      // true
System.out.println(str4.equals(str3));      // true
```

>Common Operations in Strings
```java
String str5 = "1@2.3";
System.out.println(str1.length());          // returns length of string
String[] splits = str5.split(".");          // divide string by "."(dots) -> creates String array
System.out.println(splits);
System.out.println(str1.concat(str2));      // join two strings
System.out.println(str1.charAt(0));         // returns first char of string
System.out.println(str1.getBytes());        // convert string into bytes
System.out.println(str5.replace("@", ".")); // replace @ signs with dots in string
System.out.println(str1.substring(0, 2));   // returns the sub string indexed from 0 to 1(<2)
System.out.println(str1.isEmpty());         // check string is empty
System.out.println(str1.equals(str2));      // check content of two strings
System.out.println(str1.contains("Sa"));    // check a given phrase is included in string
```
## 2. StringBuilder Class

* StringBuilder is **MUTABLE**.
* **Not Synchronized**. Therefore -> **Not Thread Safe** <br>
Two threads can not access the same StringBuffer object.
* More efficient

```java
StringBuilder sb = new StringBuilder("Hello ");
sb.append("Guys");
System.out.println(sb);
```
>Common Operations in StringBuilder
```java
sb.append("Good Morning!"); // append another string in to the end
sb.insert(0, "My");         // add char set into specified index
sb.substring(0, 2);         // returns the sub string indexed from 0 to 1(<2)
sb.replace(0, 4, "Nice");   // replace the char set from 0 to 3(<4) index
sb.deleteCharAt(0);         // deletes char at index 0
sb.charAt(0);               // returns first char of string
```

## 3. StringBuffer Class

* **Synchronized**. Therefore -> **Thread Safe** <br>
Two threads can not access the same StringBuffer object.
* Less efficient
```java
StringBuffer buf = new StringBuffer("Hello");
```
* Methods are same as StringBuilder Class