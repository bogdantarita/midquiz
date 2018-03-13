package ro.siit.midquiz;

public class Square implements Shape {

    //l - latura patratului
    private double l;

    public Square(double l){

        this.l = l;

    }

    public double calculatePerimeter() {
        return 4*l;
    }

    public double calculateSurface() {
        return l*l;
    }
}
