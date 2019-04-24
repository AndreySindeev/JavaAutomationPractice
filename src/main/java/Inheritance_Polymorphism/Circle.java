package Inheritance_Polymorphism;

public class Circle {

    double radius;
    String colors;


    protected Circle(){
        this.radius = radius;
        this.colors = colors;
    }

    protected Circle(double radius){
        this.radius = radius;
    }

    protected Circle(double radius, String colors){
        this.radius = radius;
        this.colors = colors;
    }

    protected double getRadius() {
        return radius;
    }

    protected String getColors() {
        return colors;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected void setColors(String colors) {
        this.colors = colors;
    }


    protected double getArea(){
        return Math.PI * Math.pow(radius, 2) ;
    }

    public String toString(){
        return String.format("\nCircle:\nRadius - %.2f\nColour - %s\n", radius,colors);
    }


}
