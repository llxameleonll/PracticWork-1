package Practic3.ex2and3;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {};
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public String toString() {
        return "Shape \n{Color - " + color + "\nFilled - " + filled + '}';
    }
}

class Circle extends Shape{
    protected double radius;
    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius (double radius){
        this.radius = radius;
    }

    double getArea(){
        return 3.14*this.radius*this.radius;
    }
    double getPerimeter(){
        return 2*3.14*this.radius;
    }
    public String toString (){
        return "Shape - Circle\n" + "Color - " + color + "\nFilled - " + filled
                + "\nRadius - " + radius;
    }
}
class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(){};
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle (double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLenght(double length){
        this.length = length;
    }

    public double getArea(){
        return this.width*this.length;
    }

    public double getPerimeter(){
        return (2*this.width)+(2*this.length);
    }

    public String toString(){
        return "Shape - Circle\n" + "Color - " + color + "\nFilled - " + filled
                + "\nWidth - " +width +"\nLength - " + length;
    }

}

class Square extends Rectangle{
    protected double side;
    public Square(){};
    public Square(double side){
        this.side = side;
    }

    public Square (double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void setWidth(double side){
        setWidth(side);
    }

    public void setLength(double side){
        setLenght(side);
    }

    public double getArea(){
        return this.side*this.side;
    }

    public double getPerimeter(){
        return 4*this.side;
    }

    public String toString(){
        return "Shape - Square\n" + "Color - " + color + "\nFilled - " + filled
                + "\nSide - " + side;
    }
}
