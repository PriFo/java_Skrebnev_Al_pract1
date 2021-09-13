package pract3;
import java.lang.*;
import java.util.Scanner;

public class TestShape {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите цвет, правдивость заполненности и радиус");
        Shape s1 = new Circle(in.nextLine(),in.nextBoolean(),in.nextDouble());
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        Shape s2 = new Rectangle(1.0,1.5);
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        Scanner in2 = new Scanner(System.in);
        System.out.println("Введите цвет и правдивость заполненности");
        Shape s3 = new Squere(3.0,in2.nextLine(),in2.nextBoolean());
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println("Введите позиции по х и у и скорости по данным координатам");
        Movable move = new MovablePoint(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
        System.out.println(move);
        move.moveLeft();
        move.moveUp();
        System.out.println(move);
        System.out.println("Введите позиции по х и у, скорости по данным координатам и радиус");
        Movable moveCircle = new MovableCircle(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
        System.out.println(moveCircle);
        moveCircle.moveUp();
        moveCircle.moveRight();
        System.out.println(moveCircle);
    }
}
