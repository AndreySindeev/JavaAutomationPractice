package Inheritance_Polymorphism;

public class Cylinder extends Circle {

    double height;

    Cylinder(){
        this.height = height;
    }

    Cylinder(double radius){
        //super or this?
        this.radius = radius;
    }

    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    Cylinder(double radius, double height, String colors){
        this.radius = radius;
        this.height = height;
        this.colors = colors;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return 2 * Math.PI * radius * height + 2 * super.getArea();
    }

    public String toString(double radius, double height, String colors){
        return String.format("\nCylinder:\nRadius - %.2f\nHeight - %.2f\nColour - %s\n", this.radius, this.height, this.colors);
    }

    public double getVolume(){
        return height *  getArea();
    }
}
