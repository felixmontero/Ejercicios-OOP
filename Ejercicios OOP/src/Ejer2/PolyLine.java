package Ejer2;

import java.util.ArrayList;
import java.util.List;

public class PolyLine {


    List<Point> points;

    public PolyLine() {

        points = new ArrayList<Point>();

    }

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(int x,int y){

        Point p1 = new Point (x, y);
        points.add(p1);

    }

    public void appendPoint(Point point){
        points.add(point);
    }

    @Override
    public String toString() {

        return "PolyLine{" +
                "puntos=" + points +
                '}';
    }

    public double getLength() {

        // distancia -> hipotenusa (teorema de pitagoras)

        double distance = 0, side1 =0, side2 = 0;

        for (int a=0; a < points.size()-1; a++) {
            side1 = this.points.get(a).getX() - this.points.get(a + 1).getX();
            side2 = this.points.get(a).getY() - this.points.get(a + 1).getY();

            distance += Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        }
        return distance;
    }

}
