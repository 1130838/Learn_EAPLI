package domain;

/**
 * Created by bruno.devesa on 04-07-2015.
 */
public class Rectangule implements Shape {

    double side1;
    double side2;

    public Rectangule() {
    }

    public Rectangule(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double calculateArea() {
        return side1*side2;
    }

    @Override
    public String toString() {
        return "Rectangule{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }
}
