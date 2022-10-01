package Ejer3;

import java.awt.geom.Area;

public class main {
    public static void main(String[] args) {

        Circle circulo = new Circle(5);
        System.out.println(circulo.getArea()+" "+circulo.getPerimeter());
        circulo.toString();

        ResizableCircle TransmuteCircle = new ResizableCircle(4);
        System.out.println(TransmuteCircle.getArea());
        TransmuteCircle.toString();


    }
}
