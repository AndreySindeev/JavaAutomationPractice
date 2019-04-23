package Inheritance_Polymorphism;

public abstract class Animal {

    protected String color;
    protected int legs;
    protected String name = "DEFAULT";




    static void printInformation(String color, String name){
        System.out.println("color is: " + color);
        System.out.println("name is " + name);
    }


    public abstract void voiceMethodForAnimal();
}
