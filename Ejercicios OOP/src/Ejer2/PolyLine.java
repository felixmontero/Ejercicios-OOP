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

        return 0;

    }

}
