package Exceptions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("");
        }catch (MyException mException){
            System.out.println(mException.getExceptionString());
        }finally {
            System.out.println("Finally block! All success!");
        }
    }




}
