package Shapes;

public class Square extends Rectangle {


    private double defaultSide = 1.0;

    public Square(){
        this.width = defaultSide;
        this.length = defaultSide;
        this.color = defaultColor;
        this.filled = defaultFilled;
    }

    public Square(double side){
        this.width = side;
        this.length = side;
        this.color = defaultColor;
        this.filled = defaultFilled;
    }

    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = this.length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = this.width;
    }

    @Override
    public String toString() {
        return String.format( "A Square with side = %s, which is a subclass of %s", width, super.toString());
    }

}
