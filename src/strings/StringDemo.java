package strings;

public class StringDemo {

    public static void main(String[] args) {

        String str1 = "Salitha";
        String str2 = "Salitha";
        String str3 = new String("Salitha");
        String str4 = new String("Salitha");
        String str5 = "1@2.3";

        System.out.println(str1.length());          // returns length of string
        String[] splits = str5.split(".");     // divide string by "."(dots) -> creates String array
        System.out.println(splits);
        System.out.println(str1.concat(str2));      // join two strings
        System.out.println(str1.charAt(0));         // returns first char of string
        System.out.println(str1.getBytes());        // convert string into bytes
        System.out.println(str5.replace("@", "."));     // replace @ signs with dots in string
        System.out.println(str1.substring(0, 2));   // returns the sub string indexed from 0 to 1(<2)
        System.out.println(str1.isEmpty());         // check string is empty
        System.out.println(str1.equals(str2));      // check content of two strings
        System.out.println(str1.contains("Sa"));    // check a given phrase is included in string
        // Check object level
        System.out.println(str1 == str2);           // true
        System.out.println(str1 == str3);           // false
        System.out.println(str3 == str4);           // false

        // Check content
        System.out.println(str1.equals(str2));      // true
        System.out.println(str1.equals(str3));      // true
        System.out.println(str1.equals(str3));      // true
        System.out.println(str2.equals(str3));      // true
        System.out.println(str4.equals(str3));      // true

        String s1 = "Hello ";
        String s2 = "World";
        String s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println("s1: "+s1+" "+"s2: "+s2);    // s1 s2 not changed
        s1 = s1.concat(s2);
        System.out.println("s1: "+s1+" "+"s2: "+s2);    // s2 changed due to assignment


        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append("Guys");
        System.out.println(sb);
        sb.append("Good Morning!");     // append another string in to the end
        sb.insert(0, "My");    // add char set into specified index
        sb.substring(0, 2);           // returns the sub string indexed from 0 to 1(<2)
        sb.replace(0, 4, "Nice");   // replace the char set from 0 to 3(<4) index
        sb.deleteCharAt(0);             // deletes char at index 0
        sb.charAt(0);                   // returns first char of string

        StringBuffer buf = new StringBuffer("Hello");
    }
}
