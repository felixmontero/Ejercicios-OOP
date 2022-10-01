package Ejer3;
import java.math.*;
public class Circle implements GeometricObject{

    protected double radius;

    public Circle(double radius) {

        this.radius= radius;

    }

    @Override
    public double getPerimeter() {

       double perimeter= 2*Math.PI*radius;

        return perimeter;
    }

    @Override
    public double getArea() {

        double area= Math.PI*radius;
        return area;
    }

    @Override
    public String toString() {

        return "Circle{"+ radius+ "}";

    }
}
