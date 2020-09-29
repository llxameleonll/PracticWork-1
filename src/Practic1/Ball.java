package Practic1;

public class Ball {
    private String color;
    private double weight;

    public Ball (String c, double w) {
        color = c;
        weight = w;
    }

    public Ball() {
        color = "red";
        weight = 1;
    }

    public void setColor (String c) {
        color = c;
    }

    public void setWeight (double w) {
        weight = w;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public String toString () {
        return "color = " + this.color + ", weight = " + this.weight;
    }


}













