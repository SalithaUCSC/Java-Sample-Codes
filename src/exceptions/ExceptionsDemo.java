package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsDemo {

    static void validate(int salary){
        if(salary<30000)
            throw new ArithmeticException("not valid");
        else
            System.out.println("You can apply the loan");
    }

    static void testNumber(int i) throws FileNotFoundException, IOException {
        if(i < 0){
            throw new FileNotFoundException("Negative Integer "+i);
        }else if(i > 10){
            throw new IOException("Only supported for index 0 to 10");
        }

    }

    public static void main(String args[]){

        // basic exceptions
        System.out.println("Start Program");
        int x = 10, d = 0;
        try{
            int y = 50/d;
//            System.out.println("This is not printed!");
        } catch(ArithmeticException ex){
            System.out.println("This is the catch block");
            ex.printStackTrace();
        } finally {
            System.out.println("Finally block is executed!");
        }



    }

}
