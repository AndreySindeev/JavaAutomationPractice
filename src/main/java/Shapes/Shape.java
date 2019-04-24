package Shapes;

public abstract class Shape {

    protected String color;
    protected boolean filled;

    protected String defaultColor = "green";
    protected boolean defaultFilled = true;

    protected Shape(){
        this.color = defaultColor;
        this.filled = defaultFilled;
    }

    protected Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return String.format( "A Shape with the colour of %s and %s", color, filled ? "filled" : "Not filled");
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean isInside(double x, double y);


}
