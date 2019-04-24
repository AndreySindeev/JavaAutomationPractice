package Exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {


    public static void main(String[] args) {
        taskFirst();
    }

    static void taskFirst(){
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);

        try {
            arrayList.get(8);
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Index out of list ");
        }
    }
}
