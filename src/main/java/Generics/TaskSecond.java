package Generics;

public class TaskSecond {

    protected static <T extends Comparable<T>> boolean compare(T element1, T element2) {

        return element1.compareTo(element2) == 0;
    }



}
