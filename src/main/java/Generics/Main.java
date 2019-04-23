package Generics;

import Shapes.Circle;
import Shapes.Shape;

import static com.sun.xml.internal.ws.util.VersionUtil.compare;

public class Main {

    public static void main(String[] args) {
//
//        Pair<String, Circle> objectsPair = new Pair("Simple Circle", new Circle() {
//        });
//
//        System.out.println("First: " + objectsPair.getElementFirst() + '\n' + "Second: " + objectsPair.getElementSecond() );

        TaskSecond taskSecond = new TaskSecond();

        String stringOne = "txt1";
        String stringTwo = "txt1";
        String stringThree = "tex2";

        System.out.println(taskSecond.compare(stringOne,stringOne));
        System.out.println(taskSecond.compare(stringTwo,stringTwo));
        System.out.println(taskSecond.compare(stringOne,stringTwo));
        System.out.println(taskSecond.compare(stringTwo,stringThree));
        System.out.println(taskSecond.compare(stringThree,stringTwo));


        //Account account = new Account("133FEQ213", 21312, 213123);

    }
    }

