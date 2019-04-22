package Generics;

import Shapes.Circle;
public class Main {

    public static void main(String[] args) {

        Pair<String, Circle> objectsPair = new Pair<String, Circle>("Simple Circle", new Circle());

        System.out.println("First: " + objectsPair.getFirstElement() + '\n' + "Second: " + objectsPair.getSecondElement() );

    }
}
