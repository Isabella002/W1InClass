package Interfaces;

public abstract class CircularBase {

    private double radius;

    public void setRadius(double newRadius){

        radius = newRadius;
    }
    public double getRadius() {
        return radius;
    }

    public abstract double getArea();

}
