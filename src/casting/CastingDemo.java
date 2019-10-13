package casting;

public class CastingDemo {

    public static void main(String[] args) {

        byte x = 10;        // SIZE - 1 bytes
        short y = 20;       // SIZE - 2 bytes
        int z = 30;         // SIZE - 4 bytes
        double d = 40;      // SIZE - 8 bytes

        int i = y;              // Assign 2 bytes y to 4 bytes int
        short s = x;            // Assign 1 byte x to 2 bytes short
        double t = i;           // Assign 4 bytes i to 8 bytes double

        System.out.println(t);
        System.out.println(s);
        System.out.println(i);

        byte b = (byte) y;      // Assign 2 bytes y to 1 byte
        short a = (short) z;    // Assign 4 bytes z to 2 bytes short
        int j = (int) d;        // Assign 8 bytes z to 4 bytes int
        System.out.println(a);
        System.out.println(b);
        System.out.println(j);


        // OBJECT CASTING

        // 1. UP CASTING

        Dog dog1 = new Dog();
        Animal animal1 = (Animal) dog1;
        animal1.eat();

        Mammal mammal1 = new Dog();
        Animal animal2 = new Dog();
        mammal1.eat();
        animal2.eat();

        // 1. DOWN CASTING

        Animal animal3 = new Cat();
        Dog dog2 = (Dog) animal3;
        animal3.eat();
        dog2.eat();

    }
}
