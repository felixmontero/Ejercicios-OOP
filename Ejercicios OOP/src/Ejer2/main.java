package Ejer2;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        PolyLine polyLine= new PolyLine();
        System.out.println(polyLine);
        polyLine.appendPoint(1, 9);
        polyLine.appendPoint(4, 9);
        System.out.println(polyLine);
        System.out.println(polyLine.getLength()+ "");

        List<Point> ListTestPoints= new ArrayList<Point>();
        ListTestPoints.add(new Point(9, 12));
        ListTestPoints.add(new Point(19, 34));
        System.out.println(ListTestPoints);

    }
}
