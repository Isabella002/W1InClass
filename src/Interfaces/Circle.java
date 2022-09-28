package Interfaces;

import java.util.Objects;

public class Circle implements Comparable<Circle>, MeasurableInterface {

    private double radius;

    public Circle(){

    }

    public Circle(double newRadius){
        assert radius != 0: "Radius cannot be equal to 0.";
        radius = newRadius;
    }

    public double getCircumference() {

        return 2.0 * Math.PI * radius;
    }

    public double getPerimeter() {

        return getCircumference();
    }

    public double getArea() {

        return Math.PI * radius * radius;
    }

    public String toString() {
        return radius + " ";
    }

    public int compareTo(Circle other) {
        int result;
        if (this.equals(other))
            result = 0;

        else if (radius < other.radius)
            result = -1;
         else
            result = 1;

        return result;
    }


    public boolean equals(Object other) {
        boolean result;
        if ((other == null) || (getClass() != other.getClass()))
            result = false;
        else {
            Circle circle = (Circle) other;
            return Double.compare(circle.radius, radius) == 0;
          }
        return false;
       }

    }
    


