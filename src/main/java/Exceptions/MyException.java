package Exceptions;

public class MyException extends Exception{

    private String exceptionString;

    public MyException(String exceptionString) {
        this.exceptionString = exceptionString;
    }

    public String getExceptionString(){
        return exceptionString;
    }
}
