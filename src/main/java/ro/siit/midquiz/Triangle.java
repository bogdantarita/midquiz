package ro.siit.midquiz;
import static java.lang.Math.sqrt;

public class Triangle implements Shape {

    //lungimile laturilor triunghiului
    private double a;
    private double b;
    private double c;

    public Triangle(double a,double b,double c){

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public double calculateSurface() {
        double p = calculatePerimeter()/2;//folosim semi-perimetru pentru calularea ariei unui triunghi

        return sqrt(p * ( p - a ) * ( p - b ) * ( p - c));
    }
}
