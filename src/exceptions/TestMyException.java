package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestMyException {

    private static void processErrorMsgs(MyException e) throws MyException {
        switch(e.getErrorLine()){
            case "BAD_FILE_TYPE":
                System.out.println("BAD FILE TYPE");
                throw e;
            case "FILE_NOT_FOUND_EXCEPTION":
                System.out.println("FILE NOT FOUND");
                throw e;
            case "FILE_CLOSE_EXCEPTION":
                System.out.println("CAN NOT CLOSE FILE");
                break;
            default:
                System.out.println("UNKNOWN EXCEPTION "+e.getMessage());
                e.printStackTrace();
        }
    }

    private static void processFile(String file) throws MyException {
        InputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new MyException(e.getMessage(),"FILE_NOT_FOUND_EXCEPTION");
        } finally{
            try {
                if(fis !=null){
                    fis.close();
                }
            } catch (IOException e) {
                throw new MyException(e.getMessage(),"FILE_CLOSE_EXCEPTION");
            }
        }
    }

    public static void main(String[] args) throws MyException {

        try {
            processFile("test.tx");
        } catch (MyException e) {
            processErrorMsgs(e);
        }

    }
}
