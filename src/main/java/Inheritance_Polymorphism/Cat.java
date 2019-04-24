package Inheritance_Polymorphism;

public class Cat extends Animal {

    public String name;

    Cat(){

    }
    Cat(String name){
        this.name = name;
    }



    public void printInfo(){
        System.out.println("Cat name is: " + super.name);
    }


}
