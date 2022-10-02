package Ejer4;

public class main {

    public static void main(String[] args) {

        Movable point1 = new MovablePoint(4, 4, 5, 10);     // upcast
        System.out.println(point1.toString());
        point1.moveRight();
        System.out.println(point1.toString());
        point1.moveLeft();
        System.out.println(point1.toString());

        Movable Circle1 = new MovableCircle(1, 2, 3, 4, 20); // upcast
        System.out.println(Circle1.toString());
        Circle1.moveLeft();
        System.out.println(Circle1.toString());
        Circle1.moveRight();
        System.out.println(Circle1.toString());

    }

}
