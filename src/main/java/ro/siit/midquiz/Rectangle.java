package ro.siit.midquiz;

public class Rectangle implements Shape {

    //the width of the rectangle
    private double w;
    //the lenght of the rectangle
    private double l;

    public Rectangle(double w, double l){

        this.w = w;
        this.l = l;

    }

    public double calculatePerimeter() {
        return 2*(w+l);
    }

    public double calculateSurface() {
        return w*l;
    }
}
