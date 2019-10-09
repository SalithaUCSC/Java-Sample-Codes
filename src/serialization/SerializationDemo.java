package serialization;

import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) {

        String file = "E:\\IMPORTANT\\Java-Sample-Codes\\src\\serialization\\object.txt";
        Person person1 = new Person("salitha", 25, "SE");
        System.out.println("Object: "+person1);

        // Serialization
        try {
            FileOutputStream fOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fOut);
            out.writeObject(person1);
            System.out.println("Serialization: "+out);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try {
            FileInputStream fIn = new FileInputStream(file);
            ObjectInputStream in
                    = new ObjectInputStream(fIn);
            Person person2 = (Person) in.readObject();
            System.out.println("Deserialization: "+person2);
            fIn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
