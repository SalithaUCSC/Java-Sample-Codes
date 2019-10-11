package exceptions;

public class MyException extends Exception {

    private String errorLine = "Unknown Exception";
    private int errorCode = 404;

    public MyException(String message, String errorLine){
        super(message);
        this.errorLine = errorLine;
    }

    public String getErrorLine(){
        return this.errorLine;
    }

    public int getErrorCode(){
        return this.errorCode;
    }

}
