package pract3;

public class Squere extends Rectangle{
    public Squere(){
        super();
    }
    public Squere(double side){
        super(side,side);
    }
    public  Squere(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return this.length;
    }
    public void setSide(double side){
        this.length = side;
        this.width = side;
    }
    @Override
    public String toString(){
        return ("Сторона квадрата side:" + this.width + " цвет квадрата - " + this.color + " filled is " + this.filled);
    }
}