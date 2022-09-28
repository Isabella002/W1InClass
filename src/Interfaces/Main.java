package Interfaces;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(0);
        Circle c1 = new Circle(5.0);
        Circle c2 = new Circle(5.0);
        Circle c3 = new Circle(9.0);

        System.out.println("c1 and c2 are equal: ");
        System.out.println("c1.equals(c2): " + c1.equals(c2));
        System.out.println("c1.compareTo(c2): " + c1.compareTo(c2));
        System.out.println();

        System.out.println("  c1 and c3 are not equal: ");
        System.out.println("  c1.equals(c3): " + c1.equals(c3));
        System.out.println("  c1 < c3: ");
        System.out.println("  c1.compareTo(c3): " + c1.compareTo(c3));
        System.out.println();

        System.out.print("Calling aMethod(c3); result should be > 0 : ");
        aMethod(c3);

        MeasurableInterface c4 = new Circle(9.0);
        System.out.println("c4, whose radius is 9, has a circumference of " + c4.getPerimeter());
        System.out.println(" and an area of " + c4.getArea());

        Square s1 = new Square(4.0);
        System.out.println("s1, whose side is 4, has a Perimeter of " + s1.getPerimeter());
        System.out.println(" and an area of " + s1.getArea());

        System.out.println("\nDone.");

    }

    public static void aMethod(Comparable<Circle> item){
        System.out.println(item.compareTo(new Circle(6.0)));

    }
}




