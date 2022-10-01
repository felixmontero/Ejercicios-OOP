package Ejer2;


import java.util.List;

public class Point {
   private int x;
   private int y;
   int incremento=0;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {

        return "(x=" + x +
                ", y=" + y + ")";
    }
}
